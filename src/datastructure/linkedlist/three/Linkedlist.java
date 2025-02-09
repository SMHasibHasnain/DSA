package datastructure.linkedlist.three;

public class Linkedlist {
    Node head = null;
    static class Node {
        int data;
        Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    void insert(int data) {
        Node newNode = new Node(data, null);
        if (head==null) {
            this.head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(4);
        linkedlist.display();
    }
}
