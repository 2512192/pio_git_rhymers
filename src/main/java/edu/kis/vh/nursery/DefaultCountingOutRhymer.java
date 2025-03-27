package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_CAPACITY = 12;
    public static final int EMPTY_STACK_INDICATOR = -1;
    public static final int DEFAULT_RETURN_VALUE = -1;

    private final int[] numbers = new int[STACK_CAPACITY];

    public int total = EMPTY_STACK_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_INDICATOR;
    }

    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

}
