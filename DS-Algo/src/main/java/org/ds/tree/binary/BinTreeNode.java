package org.ds.tree.binary;

/**
 * @author amos
 * @version V0.1
 * @date Sep 21, 2016
 */
public class BinTreeNode<K, V>{
    private K key;
    private V value;
    private boolean isRoot;

    private BinTreeNode<K, V> left;
    private BinTreeNode<K, V> right;

    public BinTreeNode() {
    }

    public BinTreeNode(K key, V value, BinTreeNode<K, V> left, BinTreeNode<K, V> right, boolean isRoot) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
        this.isRoot = isRoot;
    }

    public boolean isRoot() {
        return isRoot;
    }

    public void setRoot(boolean isRoot) {
        this.isRoot = isRoot;
    }

    public boolean hasLeftChild() {
        return left != null;
    }

    public BinTreeNode<K, V> getLeftChild() {
        return left;
    }

    public boolean hasRightChild() {
        return right != null;
    }

    public BinTreeNode<K, V> getRightChild() {
        return right;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
