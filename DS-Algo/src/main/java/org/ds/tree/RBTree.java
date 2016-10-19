package org.ds.tree;

import java.util.LinkedList;
import java.util.List;

public class RBTree<K extends Comparable<K>, V>{

    private RBTNode<K, V> root;

    public static class RBTNode<K extends Comparable<K>, V>{
        K key;
        V value;

        boolean isBlack;
        RBTNode<K, V> left;
        RBTNode<K, V> right;
        RBTNode<K, V> parent;

        public RBTNode(K key, V value, boolean isBlack, RBTNode<K, V> left, RBTNode<K, V> right, RBTNode<K, V> parent) {
            this.key = key;
            this.value = value;
            this.isBlack = isBlack;
            this.right = right;
            this.parent = parent;
        }

        @Override
        public String toString() {
            return key + "," + value + "," + (isBlack ? "黑" : "红");
        }

    }

    public V put(K key, V value) {
        RBTNode<K, V> parent = null;
        RBTNode<K, V> next = root;

        int cmp = 0;
        while (next != null) {
            parent = next;

            cmp = key.compareTo(next.key);
            if (cmp < 0) {
                next = next.left;
            } else if (cmp > 0) {
                next = next.right;
            } else {
                V oldValue = next.value;
                next.value = value;
                return oldValue;
            }
        }

        if (parent == null) {
            root = new RBTNode<>(key, value, true, null, null, null);
        } else {
            RBTNode<K, V> newNode = new RBTNode<>(key, value, false, null, null, parent);

            if (cmp < 0) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }

            fixAfterInsertion(newNode);
        }

        return null;
    }

    private void setRoot(RBTNode<K, V> newRoot) {
        this.root = newRoot;
    }

    private void fixAfterInsertion(RBTNode<K, V> node) {
        setRed(node);

        if (node == root) {
            setBlack(node);
            return;
        }

        if (isBlack(parentOf(node))) {
            return;
        }

        RBTNode<K, V> uncle = uncleOf(node);
        if (isRed(uncle)) {
            setBlack(parentOf(node));
            setBlack(uncle);
            setRed(grandParentOf(node));

            fixAfterInsertion(grandParentOf(node));
        } else {
            if (parentOf(node) == leftOf(grandParentOf(node))) {
                if (node == rightOf(parentOf(node))) {
                    RBTNode<K, V> parent = parentOf(node);

                    rotateLeft(parent);

                    node = parent;
                }

                setBlack(parentOf(node));
                setRed(grandParentOf(node));

                rotateRight(grandParentOf(node));
            } else {
                if (node == leftOf(parentOf(node))) {
                    RBTNode<K, V> parent = parentOf(node);

                    rotateRight(parent);

                    node = parent;
                }

                setBlack(parentOf(node));
                setRed(grandParentOf(node));

                rotateLeft(grandParentOf(node));
            }
        }
    }

    public void remove(K key) {
        RBTNode<K, V> removeNode = getNodeByKey(key);

        if (removeNode == null) {
            return;
        }

        if (leftOf(removeNode) != null && rightOf(removeNode) != null) {
            RBTNode<K, V> successor = successorOfInOrder(removeNode);

            if (successor != null) {
                removeNode.key = successor.key;
                removeNode.value = successor.value;
                removeNode = successor;
            }
        }

        RBTNode<K, V> replacement = leftOf(removeNode) != null ? leftOf(removeNode) : rightOf(removeNode);
        if (isRed(removeNode)) {
            if (replacement != null) {
                setParent(replacement, parentOf(removeNode));
            }

            if (removeNode == leftOf(parentOf(removeNode))) {
                setLeft(parentOf(removeNode), replacement);
            } else {
                setRight(parentOf(removeNode), replacement);
            }

            setParent(removeNode, null);
            setLeft(removeNode, null);
            setRight(removeNode, null);
        } else {
            if (replacement != null) {
                setParent(replacement, parentOf(removeNode));

                if (removeNode == root) {
                    setBlack(replacement);
                    root = replacement;
                    return;
                }

                if (removeNode == leftOf(parentOf(removeNode))) {
                    setLeft(parentOf(removeNode), replacement);
                } else {
                    setRight(parentOf(removeNode), replacement);
                }

                setParent(removeNode, null);
                setLeft(removeNode, null);
                setRight(removeNode, null);

                if (isRed(replacement)) {
                    setBlack(replacement);
                } else {
                    fixAfterDeletion(replacement);
                }
            } else {
                if (removeNode == root) {
                    root = null;
                    return;
                }

                fixAfterDeletion(removeNode);

                if (removeNode == leftOf(parentOf(removeNode))) {
                    setLeft(parentOf(removeNode), null);
                } else {
                    setRight(parentOf(removeNode), null);
                }

                setParent(removeNode, null);
                setLeft(removeNode, null);
                setRight(removeNode, null);
            }
        }
    }

    private void fixAfterDeletion(RBTNode<K, V> node) {
        // TODO
        if (node == root) {
            return;
        }

        RBTNode<K, V> sibing = sibingOf(node);

        if (isRed(sibing)) {
            setBlack(sibing);
            setRed(parentOf(node));
            if (node == leftOf(parentOf(node))) {
                rotateLeft(parentOf(node));
            } else {
                rotateRight(parentOf(node));
            }

            fixAfterDeletion(node);
        } else {
            if (isBlack(parentOf(node)) && isBlack(leftOf(sibing)) && isBlack(rightOf(sibing))) {
                setRed(sibing);

                fixAfterDeletion(parentOf(node));
            } else if (isRed(parentOf(node)) && isBlack(leftOf(sibing)) && isBlack(rightOf(sibing))) {
                setRed(sibing);
                setBlack(parentOf(node));
                //            } else if (node == leftOf(parentOf(node)) && isRed(leftOf(sibing)) && isBlack(rightOf(sibing))) {
            } else if (node == leftOf(parentOf(node))) {
                if (isRed(leftOf(sibing)) && isBlack(rightOf(sibing))) {
                    setRed(sibing);
                    setBlack(leftOf(sibing));
                    rotateRight(sibing);
                }

//                fixAfterDeletion(node);
                setBlack(rightOf(sibing));
                swapRB(parentOf(node), sibing);

                rotateLeft(parentOf(node));
//            } else if (node == rightOf(parentOf(node)) && isBlack(leftOf(sibing)) && isRed(rightOf(sibing))) {
            } else if (node == rightOf(parentOf(node))){
                if(isBlack(leftOf(sibing)) && isRed(rightOf(sibing))) {
                    setRed(sibing);
                    setBlack(rightOf(sibing));

                    rotateLeft(sibing);
                }
                setBlack(leftOf(sibing));
                swapRB(parentOf(node), sibing);

                rotateRight(parentOf(node));
//                fixAfterDeletion(node);

//            } else if (node == leftOf(parentOf(node)) && isBlack(leftOf(sibing)) && isRed(rightOf(sibing))) {
//                setBlack(rightOf(sibing));
//                swapRB(parentOf(node), sibing);
//
//                rotateLeft(parentOf(node));
//            } else if (node == rightOf(parentOf(node)) && isRed(leftOf(sibing)) && isBlack(rightOf(sibing))) {
//                setBlack(leftOf(sibing));
//                swapRB(parentOf(node), sibing);
//
//                rotateRight(parentOf(node));
            }
        }

    }

    private void swapRB(RBTNode<K, V> node1, RBTNode<K, V> node2) {
        boolean tmp = node2.isBlack;
        node2.isBlack = node1.isBlack;
        node1.isBlack = tmp;
    }

    private RBTNode<K, V> successorOfInOrder(RBTNode<K, V> node) {
        if (rightOf(node) != null) {
            RBTNode<K, V> rightBranch = rightOf(node);

            RBTNode<K, V> parent = rightBranch;
            RBTNode<K, V> left = leftOf(rightBranch);

            while (left != null) {
                parent = left;
                left = leftOf(left);
            }

            return parent;
        } else {
            RBTNode<K, V> tmpNode = node;
            while (parentOf(tmpNode) != null && tmpNode == rightOf(parentOf(tmpNode))) {
                tmpNode = parentOf(tmpNode);
            }

            return parentOf(tmpNode);
        }
    }

    private RBTNode<K, V> getNodeByKey(K key) {
        RBTNode<K, V> next = root;

        while (next != null) {
            int cmp = key.compareTo(next.key);

            if (cmp == 0) {
                return next;
            } else if (cmp < 0) {
                next = leftOf(next);
            } else {
                next = rightOf(next);
            }
        }

        return null;
    }

    private void setBlack(RBTNode<K, V> node) {
        node.isBlack = true;
    }

    private void setRed(RBTNode<K, V> node) {
        node.isBlack = false;
    }

    private boolean isBlack(RBTNode<K, V> node) {
        return node == null ? true : node.isBlack;
    }

    private boolean isRed(RBTNode<K, V> node) {
        return !isBlack(node);
    }

    private RBTNode<K, V> grandParentOf(RBTNode<K, V> node) {
        return parentOf(parentOf(node));
    }

    private RBTNode<K, V> parentOf(RBTNode<K, V> node) {
        return node.parent;
    }

    private RBTNode<K, V> uncleOf(RBTNode<K, V> node) {
        if (parentOf(node) == leftOf(grandParentOf(node))) {
            return rightOf(grandParentOf(node));
        } else {
            return leftOf(grandParentOf(node));
        }
    }

    private RBTNode<K, V> sibingOf(RBTNode<K, V> node) {
        if (node == leftOf(parentOf(node))) {
            return rightOf(parentOf(node));
        } else {
            return leftOf(parentOf(node));
        }
    }

    private RBTNode<K, V> leftOf(RBTNode<K, V> node) {
        return node.left;
    }

    private RBTNode<K, V> rightOf(RBTNode<K, V> node) {
        return node.right;
    }

    private void setParent(RBTNode<K, V> node, RBTNode<K, V> newParent) {
        node.parent = newParent;
    }

    private void setLeft(RBTNode<K, V> node, RBTNode<K, V> newLeft) {
        node.left = newLeft;
    }

    private void setRight(RBTNode<K, V> node, RBTNode<K, V> newRight) {
        node.right = newRight;
    }

    private void rotateLeft(RBTNode<K, V> node) {
        RBTNode<K, V> rightBranch = rightOf(node);

        setParent(rightBranch, parentOf(node));
        if (parentOf(node) == null) {
            setRoot(rightBranch);
        } else if (node == leftOf(parentOf(node))) {
            setLeft(parentOf(node), rightBranch);
        } else if (node == rightOf(parentOf(node))) {
            setRight(parentOf(node), rightBranch);
        }

        setRight(node, leftOf(rightBranch));
        if (leftOf(rightBranch) != null) {
            setParent(leftOf(rightBranch), node);
        }

        setParent(node, rightBranch);
        setLeft(rightBranch, node);
    }

    private void rotateRight(RBTNode<K, V> node) {
        RBTNode<K, V> leftBranch = leftOf(node);

        setParent(leftBranch, parentOf(node));
        if (parentOf(node) == null) {
            setRoot(leftBranch);
        } else if (node == leftOf(parentOf(node))) {
            setLeft(parentOf(node), leftBranch);
        } else if (node == rightOf(parentOf(node))) {
            setRight(parentOf(node), leftBranch);
        }

        setLeft(node, rightOf(leftBranch));
        if (rightOf(leftBranch) != null) {
            setParent(rightOf(leftBranch), node);
        }

        setParent(node, leftBranch);
        setRight(leftBranch, node);
    }

    public void print() {
        int high = getTreeHigh(root, 0);

        int width = (int)Math.pow(2, high);

        int mid = width >> 1;

        int num = 3;

        List<RBTNode<K, V>> lst = new LinkedList<>();
        lst.add(root);

        for (int i = 1; i <= high; i++) {
            int tmpMid = (int)Math.pow(2, i - 1);
            int spaceNum = num * (mid - tmpMid + 1);

            printSpace(spaceNum);

            List<RBTNode<K, V>> lstTmp = new LinkedList<>();
            lst.stream().forEach(node -> {
                if (node.key != null && node.value != null) {
                    System.out.print(node);
                    printSpace(num);

                    if (node.left != null) {
                        lstTmp.add(node.left);
                    } else {
                        lstTmp.add(getEmpty());
                    }
                    if (node.right != null) {
                        lstTmp.add(node.right);
                    } else {
                        lstTmp.add(getEmpty());
                    }
                } else {
                    System.out.print("   ");
                    lstTmp.add(getEmpty());
                    lstTmp.add(getEmpty());
                    printSpace(num);
                }
            });

            lst = lstTmp;

            System.out.println();
        }
    }

    public RBTNode<K, V> getEmpty() {
        return new RBTNode<K, V>(null, null, true, null, null, null);
    }

    private void printSpace(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(".");
        }
    }

    private int getTreeHigh(RBTNode<K, V> node, int h) {
        if (node != null) {
            int hTmp = h + 1;
            int lh = node.left == null ? hTmp : getTreeHigh(node.left, hTmp);
            int rh = node.right == null ? hTmp : getTreeHigh(node.right, hTmp);

            return lh >= rh ? lh : rh;
        }
        return 0;
    }

}