package DSA.Stack;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

//        MyStack stack = new MyStack(5);
//        stack.push(10);
//        stack.pop();
//        stack.push(20);
//
//
//        System.out.println(stack);

        /*
             the stack class is the part of the Generic Collection framework
             java is not fully object-oriented so it introduced the concept of the
             wrapper classes
         */

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

    }
}
