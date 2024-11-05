package datastructure.linkedlist.one;

public class LinkedList{
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(int key) {
        Node current = head;
        Node prev = null;

        if(head == null) {
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if(current == null) {
            return;
        }
        prev.next = current.next;

    }

    public void display() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(38);
        list.insert(28);
        list.insert(27);
        list.delete(28);
        list.display();
    }
}
