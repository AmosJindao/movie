package org.ds.tree;

public class RBTreeTest {
    public static void main(String[] args) {
		RBTree<Integer, String> tree = new RBTree<>();
		
		for(int i=0; i<10; i++){
			tree.put(i, "v"+i);
		}
		tree.print();
		
		tree.remove(3);
		tree.print();
		
		tree.remove(7);
		tree.print();
	}
}