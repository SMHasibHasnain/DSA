package datastructure.tree.binarySearchTree;

public class BST {
    public class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    private Node root;
    Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }
        if(data<root.data) {
            root.left = insert(root.left, data);
        }
        if(data>root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }
    void preOrder(Node node) {
        if(node == null) {
            return;
        }
        preOrder(node.left);
        System.out.println(node.data + "  ");
        preOrder(node.right);
    }
    public static void main(String[] args) {
        BST tree1 = new BST();
        tree1.root = tree1.insert(null, 10);
        tree1.insert(tree1.root, 5);
        tree1.insert(tree1.root, 21);
        tree1.insert(tree1.root, 4);
        tree1.insert(tree1.root, 6);
        tree1.insert(tree1.root, 15);
        tree1.insert(tree1.root, 25);
        tree1.preOrder(tree1.root);
    }
}
