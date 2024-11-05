package datastructure.linkedlist.two;

public class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(int key) {
        if(head == null) return;

        if(head.data == key) {
            head = head.next;
        }

        Node curr = head;
        Node prev = null;

        while(curr != null) {
            if(curr.data == key) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
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
        list.add(30);
        list.add(20);
        list.add(35);
        list.delete(30);
        list.display();
    }
}
