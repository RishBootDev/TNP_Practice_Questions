package DSA.Queue;

import java.util.Arrays;

public class MyCircularQueue {

    private int[] queue;
    private int size;
    private int front;
    private int rear;

    public MyCircularQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        front = -1;
        rear = -1;
    }

    private boolean isFull() {
        return (rear == size - 1 && front == 0) || (front == rear + 1);
    }

    private boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int temp = queue[front];
        queue[front] = 0;

        if (front == rear) {
            front = rear = -1;
        }
        else {
            front = (front + 1) % size;
        }

        return temp;
    }

    @Override
    public String toString() {
        return "MyCircularQueue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }
}