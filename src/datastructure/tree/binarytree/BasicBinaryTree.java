package datastructure.tree.binarytree;

import java.util.Scanner;

public class  BasicBinaryTree {
    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root = null;

    public void setRoot(Scanner scanner){
        if(root != null){
            return;
        }

        System.out.print("Enter data for root: ");
        int number = scanner.nextInt();
        root = new Node(number);
        populate(scanner, root);

    }

    private void populate(Scanner scanner, Node root){
        System.out.print("Wanna insert data on the left of " + root.data + "? (true/false): ) ");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.print("Enter data: ");
            root.left = new Node(scanner.nextInt());
            populate(scanner, root.left);
        }
        System.out.print("Wanna insert data on right of " + root.data + "? (true/false): ) ");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.print("Enter data: ");
            root.right = new Node(scanner.nextInt());
            populate(scanner, root.right);
        }
    }

    public Node getRoot(){
        return root;
    }

    public void display(Node root, String indent){
        if(root == null){
            return;
        }
        System.out.println(indent + root.data);
        indent = indent + "\t";
        display(root.left, indent);
        display(root.right, indent);
    }

    public void prettyPrint(Node node, int level){
        if(node == null){
            return;
        }
        prettyPrint(node.right, level + 1);
        if(level != 0){
            for(int i = 0; i < level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.data);
        } else {
            System.out.println(node.data);
        }
        prettyPrint(node.left, level+1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicBinaryTree tree = new BasicBinaryTree();
        tree.setRoot(scanner);
        tree.display(tree.root, "");
        tree.prettyPrint(tree.root, 0);
    }

}
