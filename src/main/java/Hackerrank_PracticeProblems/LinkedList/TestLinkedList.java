package Hackerrank_PracticeProblems.LinkedList;

public class TestLinkedList {

    public static class SinglyLinkedListNode {
          int data;
          SinglyLinkedListNode next;
    }


    public static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        // Write your code here
        int k = positionFromTail;
        int size = 0;

        SinglyLinkedListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        temp = head;
        size -= k;
        size--;
        while(size --> 0) {
            temp = temp.next;
        }

        return temp.data;

    }
}
