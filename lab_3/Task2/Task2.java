package com.company.Task2;

import java.io.*;
import java.util.function.Function;

public class Task2 implements AutoCloseable {
    private PrintStream old;
    private ByteArrayOutputStream out;
    private PrintStream newOut;

    public Task2() {
        old = System.out;
        out = new ByteArrayOutputStream();
        newOut = new PrintStream(out);
        System.setOut(newOut);
    }

    private <T, R> boolean checkConsoleOutputEquality(Function<T, R> func, String expectedResult, T... arguments) {
        for (T t : arguments) {
            func.apply(t);
        }

        try {
            return out.toString().equals(expectedResult);
        } finally {
            out.reset();
        }
    }

    @Override
    public void close() {
        System.setOut(old);
    }

    public static void main(String[] args) {
        boolean result;
        try (Task2 t2 = new Task2()) {
            result = t2.checkConsoleOutputEquality((arg) -> {
                System.out.println(arg);
                return true;
            }, "a" + System.lineSeparator() + "b" + System.lineSeparator(), "a", "b");
        }
        System.out.println(result);
    }
}