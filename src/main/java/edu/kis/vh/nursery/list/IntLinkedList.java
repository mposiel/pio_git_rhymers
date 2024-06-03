package edu.kis.vh.nursery.list;

/**
 * The Node class represents a node in a doubly linked list.
 */
class Node {
    /**
     * The value stored in the node.
     */
    private final int value;
    /**
     * The previous node in the list.
     */
    private Node prev;
    /**
     * The next node in the list.
     */
    public Node next;
    /**
     * Constructs a new Node with the specified value.
     *
     * @param i the value to be stored in the node
     */
    public Node(int i) {
        value = i;
    }
    /**
     * Returns the value stored in the node.
     *
     * @return the value of the node
     */
    public int getValue() {
        return value;
    }
    /**
     * Returns the previous node in the list.
     *
     * @return the previous node
     */
    public Node getPrev() {
        return prev;
    }
    /**
     * Sets the previous node in the list.
     *
     * @param prev the node to be set as the previous node
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}

/**
 * The IntLinkedList class represents a linked list of integers.
 */
public class IntLinkedList {
    /**
     * The last node in the linked list.
     */
    private Node lastNode;
    /**
     * Adds a new integer to the end of the linked list.
     *
     * @param i the integer to be added
     */
    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.next = new Node(i);
            lastNode.next.setPrev(lastNode);
            lastNode = lastNode.next;
        }
    }
    /**
     * Checks if the linked list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return lastNode == null;
    }
    /**
     * Checks if the linked list is full.
     * (Note: This method always returns false as the list can grow indefinitely.)
     */
    private boolean isFull() {
        return false;
    }
    /**
     * Returns the value of the last node in the linked list.
     *
     * @return the value of the last node, or -1 if the list is empty
     */
    public int top() {
        if (isEmpty())
            return -1;
        return lastNode.getValue();
    }
    /**
     * Removes and returns the value of the last node in the linked list.
     *
     * @return the value of the last node, or -1 if the list is empty
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = lastNode.getValue();
        lastNode = lastNode.getPrev();
        return ret;
    }

}
