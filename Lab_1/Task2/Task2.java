package com.company.Task2;

public class Task2 {

    public static void main(final String args[])
    {
        final String text =  "Lorem Ipsum is simply dummy text of the printing and typesetting industry." ;
        final char symbol = 'i';
        int res = 0;

        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == symbol)
                res++;

        System.out.println ( "The number of characters \""+ symbol +"\" is " + res) ;
    }
}
