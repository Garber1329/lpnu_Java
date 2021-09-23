package com.company.Task10;

import java.io.IOException;
import java.util.Scanner;

public class Task10 {
    public static void main(final String[] args) {

        for(int i = 0; i < 7; i++){
            System.out.println(
                    Day.getDay(i) + " -> "
                    + Weather.getWather() + ", temperatura: "
                    + Weather.getRandTemp() + ", Wind : "
                    + Weather.getRandWind()
            );
        }

    }
}
