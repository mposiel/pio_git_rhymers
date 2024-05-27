package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int FULL_CAPACITY = 11;
    public static final int CAPACITY = FULL_CAPACITY +1;
    public static final int EMPTY = -1;
    public static final int DEFAULT =-1;
    private final int[] numbers = new int[CAPACITY];

    public int totalCount = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == EMPTY;
    }

    public boolean isFull() {
        return totalCount == FULL_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[totalCount--];
    }

}
