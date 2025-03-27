package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static final int MAX_ITERATIONS = 15;
    public static final int HANOI_RHYMER_INDEX = 3;
    public static final String TOTAL_REJECTED_MESSAGE = "total rejected is ";

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = 1; i < MAX_ITERATIONS; i++)
            for (int j = 0; j < HANOI_RHYMER_INDEX; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < MAX_ITERATIONS; i++)
            rhymers[HANOI_RHYMER_INDEX].countIn(rn.nextInt(20));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println(TOTAL_REJECTED_MESSAGE
                + ((HanoiRhymer) rhymers[HANOI_RHYMER_INDEX]).reportRejected());

    }

}