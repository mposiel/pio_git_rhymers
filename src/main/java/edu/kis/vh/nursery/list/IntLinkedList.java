package edu.kis.vh.nursery.list;


class Node {

    private final int value;
    private Node prev;
    public Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}

public class IntLinkedList {

    private Node lastNode;
    private int nodeValue;

    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.next = new Node(i);
            lastNode.next.setPrev(lastNode);
            lastNode = lastNode.next;
        }
    }

    private boolean isEmpty() {
        return lastNode == null;
    }

    private boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return lastNode.getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = lastNode.getValue();
        lastNode = lastNode.getPrev();
        return ret;
    }

}
