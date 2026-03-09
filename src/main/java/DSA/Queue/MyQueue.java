package DSA.Queue;


import java.util.Arrays;

public class MyQueue {

    int []queue;
    int size;
    int front;
    int rear;

    MyQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        front = rear = -1;
    }

    public void enqueue(int data) {
        if(rear == size -1){
            System.out.println("the queue is full");
            return;
        }else if(front == -1) front = 0;
        rear++;
        this.queue[rear] = data;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }
}

class MyQueueDriver{
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue);
        System.out.println(queue.front);
    }
}
