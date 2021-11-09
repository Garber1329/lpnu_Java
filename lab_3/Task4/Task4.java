package com.company.Task4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task4 {
    private static int counter1;
    private static int counter2;
    private final int iterNum;
    private final int threadNum;
    private Thread[] threads;

    public static final Lock MUTEX = new ReentrantLock();

    public Task4(int numberOfThreads, int numberOfIterations) {
        iterNum = numberOfIterations;
        threadNum = numberOfThreads;
        threads = new Thread[numberOfThreads];
    }

    void joinThreads() {
        try {
            for (int i = 0; i < threadNum; i++) {
                threads[i].join();
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    void createThreads(Runnable func) {
        for (int i = 0; i < threadNum; i++) {
            threads[i] = new ThreadImpl(iterNum, func);
        }
    }

    void invokeThreads() {
        for (int i = 0; i < threadNum; i++) {
            threads[i].start();
        }
    }
    public void increment() {
        try {
            System.out.println("counter1 = " + counter1 + "; counter2 = " + counter2);
            counter1++;
            Thread.sleep(100);
            counter2++;
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    void reset() {
        counter1 = counter2 = 0;
    }

    public void incrementSyncLowConcurrency() {
        synchronized (this) {
            counter1++;
            counter2++;
            System.out.println("counter1 = " + counter1 + "; counter2 = " + counter2);
        }
    }

    public void incrementSyncHighConcurrency() {
        try {
            MUTEX.lock();
            counter1++;
            counter2++;
            System.out.println("counter1 = " + counter1 + "; counter2 = " + counter2);
        } finally {
            MUTEX.unlock();
        }
    }
}
