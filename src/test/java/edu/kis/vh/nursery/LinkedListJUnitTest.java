package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListJUnitTest {

    private IntLinkedList intLinkedList;

    @Before
    public void setUp() {
        intLinkedList = new IntLinkedList();
    }

    @Test
    public void testPush() {
        int testValue = 4;
        intLinkedList.push(testValue);
        Assert.assertEquals(testValue, intLinkedList.top());
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(intLinkedList.isEmpty());
        intLinkedList.push(5);
        Assert.assertFalse(intLinkedList.isEmpty());
    }

    @Test
    public void testTop() {
        int testValue = 4;
        intLinkedList.push(testValue);
        Assert.assertEquals(testValue, intLinkedList.top());
        Assert.assertEquals(testValue, intLinkedList.top()); // check if top doesn't remove the element
    }

    @Test
    public void testPop() {
        Assert.assertEquals(-1, intLinkedList.pop()); // check for empty list
        int testValue = 4;
        intLinkedList.push(testValue);
        Assert.assertEquals(testValue, intLinkedList.pop());
        Assert.assertEquals(-1, intLinkedList.pop()); // check after all elements are popped
    }
}