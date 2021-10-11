package com.company.Task2;

public class Task2 {
    public static void main(String[] args) {
        final Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        for (Node node : stack) {
            System.out.print(node.getData() + " ");
        }
        System.out.println();
        stack.delete();
        stack.delete();
        System.out.println(stack);
        System.out.println("isEmpty ??? " + stack.isEmpty());
        stack.delete();stack.delete();stack.delete();stack.delete();
    }
}