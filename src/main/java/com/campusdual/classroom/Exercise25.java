package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> s = new Stack<>();
        s.add("Smith");
        s.add("Montessori");
        s.add("Peralta");
        s.add("House");
        return s;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()){
            System.out.println(stack.peek());

            stack.pop();
        }
    }

    public static void main(String[] args) {
        Stack<String> s = createStack();
        printAndEmptyStack(s);

    }

}
