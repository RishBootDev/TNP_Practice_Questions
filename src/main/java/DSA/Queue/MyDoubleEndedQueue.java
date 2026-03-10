package DSA.Queue;

import java.util.Arrays;

public class MyDoubleEndedQueue {

    private int[] queue;
    private int size;
    private int front;
    private int rear;

    public MyDoubleEndedQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        front = -1;
        rear = -1;
    }

    private boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    private boolean isEmpty() {
        return front == -1;
    }

    public void insertFront(int data) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        }
        else if (front == 0) {
            front = size - 1;
        }
        else {
            front--;
        }

        queue[front] = data;
    }

    public void insertRear(int data) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        }
        else if (rear == size - 1) {
            rear = 0;
        }
        else {
            rear++;
        }

        queue[rear] = data;
    }

    public int deleteFront() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int temp = queue[front];
        queue[front] = 0;

        if (front == rear) {
            front = rear = -1;
        }
        else if (front == size - 1) {
            front = 0;
        }
        else {
            front++;
        }

        return temp;
    }

    public int deleteRear() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int temp = queue[rear];
        queue[rear] = 0;

        if (front == rear) {
            front = rear = -1;
        }
        else if (rear == 0) {
            rear = size - 1;
        }
        else {
            rear--;
        }

        return temp;
    }

    @Override
    public String toString() {
        return "MyDeque{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }
}

class DoubleEndedQueueDriver {

    public static void main(String[] args) {

        MyDoubleEndedQueue dq = new MyDoubleEndedQueue(5);

        dq.insertFront(10);
        dq.insertFront(20);
        dq.insertFront(30);

        dq.insertRear(40);

        dq.deleteFront();

        System.out.println(dq);
    }
}