package com.company.Task2;
import java.util.Iterator;

public class Stack implements Iterable<Integer> {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void add(int a) {
        top = new Node(top, a);
    }

    public int delete()  {
        int result = 0;
        if (isEmpty()) {
            System.out.println("Stack empty!");
        } else {
            result = top.data;
            top = top.next;
        }
        return result;
    }

    public boolean isEmpty() {
        return (this.top == null);
    }

    @Override
    public String toString() {
        Node currentHead = top;
        String result = "";
        while (currentHead != null) {
            result += currentHead.data + " ";
            currentHead = currentHead.next;
        }
        return result;
    }

    class NodeIterator implements Iterator<Integer> {
        private Node current = top;
        boolean hasNextN = false;

        public boolean hasNext() {
            if (current == null) {
                hasNextN = false;
            } else {
                hasNextN = current != null;
            }
            return hasNextN;
        }

        public Integer next() {
            Node result = current;
            current = current.next;
            return result.data;
        }

    }

    public Iterator<Integer> iterator() {
        return new NodeIterator();
    }
}