package DSA.LinkedList;


public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Test{
    Node head;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }
    public void insertLast(int data) {
        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public void removeFirst() {
        if(head.next == null) head = null;

        Node temp = head;
        head = temp.next;
        temp = null;
    }

    public void removeLast() {
        Node temp = head;

        while(temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }
}