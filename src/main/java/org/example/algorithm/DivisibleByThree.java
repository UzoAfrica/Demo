package org.example.algorithm;
import java.io.*;
public class DivisibleByThree {
//     Java program to find if a number is
// divisible by 3 or not
//
//     Function to find that number
//     divisible by 3 or not
        static boolean check(String str)
        {
            // Compute sum of digits
            int n = str.length();
            int digitSum = 0;
            for (int i=0; i<n; i++)
                digitSum += (str.charAt(i)-'0');

            // Check if sum of digits is
            // divisible by 3.
            return (digitSum % 3 == 0);
        }

    // main function
        public static void main (String[] args)
        {
            String str = "1332";
            if(check(str))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }


