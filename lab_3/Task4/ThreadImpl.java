package com.company.Task4;

public class ThreadImpl extends Thread {
    private final int numOfIter;
    private final Runnable func;

    public ThreadImpl(int numberOfIterations, Runnable func) {
        numOfIter = numberOfIterations;
        this.func = func;
    }

    @Override
    public void run() {
        for (int i = 0; i < numOfIter; i++) {
            try {
                func.run();
            } catch (Exception ex) {
                break;
            }
        }
    }
}