package com.company.Task3;

public class Task3 {
    public static void main(final String[] args) {
        final int[] NumArr = {7, 8, 1, 6, 4, 7, 0, 8};
        final char[] SymArr = {'y', 'z', 'j', 'j', 's'};
        String text = "";

        final int maxLength;
        if (SymArr.length >= NumArr.length) {
            maxLength = SymArr.length;
        } else {
            maxLength = NumArr.length;
        }

        for (int i = 0; i < maxLength; i++) {
            if (i < NumArr.length) {
                text += NumArr[i];
            }
            if (i < SymArr.length) {
                text += SymArr[i];
            }
        }

        System.out.println(text);
    }
}
