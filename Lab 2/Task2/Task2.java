package com.company.Task2;

public class Task2 {
    public static void main(String[] args) {
        final Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        //System.out.println(stack);
        for (Integer i : stack) {
            //System.out.print(і.getData() + " ");
            System.out.print(i + " ");
        }
        System.out.println();
        stack.delete();
        stack.delete();
        System.out.println(stack);
        System.out.println("isEmpty ??? " + stack.isEmpty());
        stack.delete();stack.delete();stack.delete();stack.delete();
    }
}