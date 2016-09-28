package org.ds.tree;

/**
 * @author amos
 * @date Sep 21, 2016
 * @version V0.1
 */
public interface BinTreeNode<K,V> {
	boolean isRoot();
	boolean hasLeftChild();
	BinTreeNode<K,V> getLeftChild();
	boolean hasRightChild();
	BinTreeNode<K,V> getRightChild();
	K getKey();
	void setKey(K key);
	V getValue();
	void setValue(V value);
	
}
