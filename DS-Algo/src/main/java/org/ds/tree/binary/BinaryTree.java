package org.ds.tree.binary;

/**
 * @author amos
 * @date 2018-01-20
 */
public class BinaryTree<K, V>{
    private BinTreeNode<K, V> root;

    public BinaryTree() {
    }

    public BinaryTree(BinTreeNode<K, V> root) {
        this.root = root;
    }

    public BinTreeNode<K, V> getRoot() {
        return root;
    }

    public void setRoot(BinTreeNode<K, V> root) {
        this.root = root;
    }

    public void add(K key, V value) {
        add(new BinTreeNode<K, V>(key, value, null, null, false));
    }

    public void add(BinTreeNode<K, V> node) {
        if (root == null) {
            node.setRoot(true);
            root = node;
            return;
        }

        //TODO
    }
}
