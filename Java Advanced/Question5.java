package Assignment4;

import java.util.Stack;

public class Question5 {
    static Stack<Integer> stack = new Stack<>();

    static void pushElement(Integer n) {
        stack.push(n);
        System.out.println(n + " is pushed into stack");
    }

    static void removeElement() {
        if (!stack.isEmpty()) {
            Integer m = stack.pop();
            System.out.println("Removed Element is " + m);
        } else {
            System.out.println("Stack is Empty...Nothing to remove");
        }
    }

    static void checkStackEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public static void main(String[] args) {
        checkStackEmpty();
        pushElement(1);
        pushElement(2);
        removeElement();
        checkStackEmpty();

    }
}
