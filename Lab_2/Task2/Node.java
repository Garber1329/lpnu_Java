package com.company.Task2;

public class Node {
    public Node next;
    public int data;

    public Node(Node next, int data) {
        this.next = next;
        this.data = data;
    }

    public int getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
}