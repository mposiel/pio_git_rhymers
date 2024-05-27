package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int size = 12;
    public static final int minusOne = -1;
    public static final int eleven = 11;
    private final int[] numbers = new int[size];

    public int totalCount = minusOne;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == minusOne;
    }

    public boolean isFull() {
        return totalCount == eleven;
    }

    protected int peekaboo() {
        if (callCheck())
            return minusOne;
        return numbers[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return minusOne;
        return numbers[totalCount--];
    }

}
