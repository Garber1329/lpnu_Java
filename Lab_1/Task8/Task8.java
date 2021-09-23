package com.company.Task8;

public class Task8 {
    public static void main(final String[] args) {
        final CustomDouble customDouble1 = new CustomDouble(1,0.1);
        final CustomDouble customDouble2 = new CustomDouble(1,0.1);

        System.out.println(customDouble1.division(customDouble2));
        System.out.println(customDouble1.sum(customDouble2));
        System.out.println(customDouble1.subtraction(customDouble2));
        customDouble1.comparisons(customDouble2);
        System.out.println(customDouble1.equals(customDouble2));
    }
}
