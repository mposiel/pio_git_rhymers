package edu.kis.vh.nursery.list;

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
