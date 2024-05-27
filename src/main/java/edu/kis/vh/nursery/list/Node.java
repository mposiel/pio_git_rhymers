package edu.kis.vh.nursery.list;

public class Node {

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
