package org.example.algorithm;

import java.util.Arrays;

public class DescendingOrder {

//    Your task is to make a function that can take any non-negative integer as
//    an argument  and return it with its digits in descending order.
//    Essentially, rearrange the digits to create the highest possible number.

    public static int rearrangeDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        // Convert the number to a string
        String numberString = String.valueOf(number);

        // Convert the string to a character array
        char[] digits = numberString.toCharArray();

        // Sort the digits in descending order
        Arrays.sort(digits);
        StringBuilder resultBuilder = new StringBuilder(new String(digits));

        // Reverse the sorted digits to get descending order
        resultBuilder.reverse();

        // Convert the result back to an integer and return
        int result = Integer.parseInt(resultBuilder.toString());
        return result;
    }

    public static void main(String[] args) {
        int number = 268534;
        int result = rearrangeDigits(number);
        System.out.println("Original number: " + number);
        System.out.println("Number with digits in descending order: " + result);
    }
}



//    public static int arrange(int number){
//        char[] digit = String.valueOf(number).toCharArray();
//        Arrays.sort(digit);
//        return Integer.parseInt(new StringBuilder(new String(digit)).toString());
//    }
//
//    public static void main(String[] args) {
//        int number = 3572846;
//        int result = arrange(number);
//        System.out.println(number);
//        System.out.println(result);
//    }
//    }






