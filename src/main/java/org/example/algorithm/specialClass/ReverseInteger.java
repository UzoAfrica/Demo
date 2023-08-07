package org.example.algorithm.specialClass;
/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



        Example 1:

        Input: x = 123
        Output: 321
        Example 2:

        Input: x = -123
        Output: -321*/
public class ReverseInteger {
        public static int reverse(int x) {
            // Flag to check if x is negative
            boolean isNegative = x < 0;

            // Convert x to positive if it's negative
            if (isNegative)
                x = -x;

            long reversed = 0;

            while (x > 0) {
                // Extract the last digit from x
                int digit = x % 10;

                // Append the digit to the reversed number
                reversed = reversed * 10 + digit;

                // Remove the last digit from x
                x /= 10;
            }

            // Check if the reversed number exceeds the integer range
            if (reversed > Integer.MAX_VALUE)
                return 0;

            // Apply the sign to the reversed number
            if (isNegative)
                reversed = -reversed;

            return (int) reversed;
        }

        public static void main(String[] args) {
            int x1 = 123;
            int reversed1 = reverse(x1);
            System.out.println("Reversed value of " + x1 + ": " + reversed1);

            int x2 = -123;
            int reversed2 = reverse(x2);
            System.out.println("Reversed value of " + x2 + ": " + reversed2);
        }
    }

    /*public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            result = result * 10 + digit;
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 12345;
        int reversed = reverse(x);
        System.out.println("Reversed: " + reversed);
    }*/


