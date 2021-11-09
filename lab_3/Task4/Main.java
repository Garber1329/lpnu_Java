package com.company.Task4;

public class Main {
    public static void main(final String[] args) {
        Task4 p4 = new Task4(5, 3);
        p4.createThreads(p4::incrementSyncLowConcurrency);
        p4.invokeThreads();
        p4.joinThreads();
        p4.reset();
        System.out.println();
        p4.createThreads(p4::incrementSyncHighConcurrency);
        p4.invokeThreads();
        p4.joinThreads();
        p4.reset();
        System.out.println();
        p4.createThreads(p4::increment);
        p4.invokeThreads();
        p4.joinThreads();
    }
}
