package DSA.Stack;

import java.util.Arrays;


// this is the traditional approach asked in the interviews
public class MyStack {

    private final int[] arr;
    private int top;

    public MyStack(int size) {
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int data) {
        if(top >= this.arr.length-1){
            System.out.println("the stack is full, cannot push any further data");
            return;
        }
        top++;
        arr[top] = data;
        System.out.println("the data successfully pushed");
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                ", top=" + top +
                '}';
    }

    public int pop() {
        if(this.top == -1) {
            System.out.println("the stack is empty cannot pop");
            return -1;
        }
        int data = arr[top];
        arr[top] = 0;
        top--;
        return data;
    }

    public int peek() {
        if(this.top == -1) {
            System.out.println("the stack is empty");
            return -1;
        }
        if(this.top == this.arr.length) {
            System.out.println("stack overflow Array Index out of bounds");
            return -1;
        }
        return this.arr[this.top];
    }
}
