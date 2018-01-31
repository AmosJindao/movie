package org.ds;

/**
 * @author amos
 * @date 2018-01-22
 */
public class BinaryTreeToDoblelyLinkedList{
    public static class Node{
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node convertToLinkedList(Node root) {
        doConertToLinkedList(root);

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    private void doConertToLinkedList(Node root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            Node left = root.left;
            doConertToLinkedList(left);

            while(left.right != null){
                left = left.right;
            }

            root.left = left;
            left.right = root;

        }

        if (root.right != null) {
            Node right = root.right;
            doConertToLinkedList(right);

            while (right.left != null){
                right = right.left;
            }

            root.right = right;
            right.left = root;
        }
    }

    void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.value + " ");
            node = node.right;
        }
    }

    public static void main(String[] args)
    {
        BinaryTreeToDoblelyLinkedList tree = new BinaryTreeToDoblelyLinkedList();

        // Let us create the tree shown in above diagram
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);

        // Convert to DLL
        Node head = tree.convertToLinkedList(root);

        // Print the converted list
        tree.printList(head);
    }
}
