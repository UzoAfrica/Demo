package org.example.algorithm;

// Consider an array where each element in the array contains a positive integer digit.
//         Taken as a whole, such an array represents a positive integer number.
//         The rightmost position of the array represents the least siginificant digit of the number.
//
//         An example digit array is [4, 2] which represents the integer 42.


//    public class ArrayPlusOne {
//        public static void main(String[] args) {
//            int[] digitArray = {5, 7, 4};
//            int number = arrayToNumber(digitArray);
//            System.out.println(number);
//        }
//
//        public static int arrayToNumber(int[] digitArray) {
//            int number = 0;
//            int power = 1;
//
//            for (int i = digitArray.length - 1; i >= 0; i--) {
//                int digit = digitArray[i];
//                number += digit * power;
//                power *= 10;
//            }
//
//            return number;
//        }
//    }
public class ArrayPlusOne {
    public static void main(String[] args) {
        int[] digitArray = {5,7,4};
        int[] resultArray = upArray(digitArray);
        for (int digit : resultArray) {
            System.out.print(digit + " ");
        }
    }

    public static int[] upArray(int[] digitArray) {
        int length = digitArray.length;
        int carry = 1;

        for (int i = length - 1; i >= 0; i--) {
            int sum = digitArray[i] + carry;
            digitArray[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 0) {
            return digitArray;
        } else {
            int[] resultArray = new int[length + 1];
            resultArray[0] = carry;
            System.arraycopy(digitArray, 0, resultArray, 1, length);
            return resultArray;
        }
    }
}

//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] digitArray = {4, 2};
//        int[] resultArray = upArray(digitArray);
//        for (int digit : resultArray) {
//            System.out.print(digit + " ");
//        }
//    }
//
//    public static int[] upArray(int[] digitArray) {
//        int carry = 1;
//
//        int[] resultArray = Arrays.stream(digitArray)
//                .map(digit -> {
//                    int sum = digit + carry;
//                    int newDigit = sum % 10;
//                    carry = sum / 10;
//                    return newDigit;
//                })
//                .toArray();
//
//        if (carry == 0) {
//            return resultArray;
//        } else {
//            int[] finalArray = new int[resultArray.length + 1];
//            finalArray[0] = carry;
//            System.arraycopy(resultArray, 0, finalArray, 1, resultArray.length);
//            return finalArray;
//        }
//    }
//}



