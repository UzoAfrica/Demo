package org.example.algorithm;


    import java.util.Arrays;

    public class AlmostEven {
        public static void main(String[] args) {
            int number = 30;
            int parts = 8;
            int[] result = splitInteger(number, parts);
            System.out.println(Arrays.toString(result));
        }

        public static int[] splitInteger(int number, int parts) {
            int[] result = new int[parts];
            int quotient = number / parts;
            int remainder = number % parts;

            // Fill the result array with the quotient value
            Arrays.fill(result, quotient);

            // Distribute the remainder among the parts
            for (int i = 0; i < remainder; i++) {
                result[i]++;
            }

            return result;
        }
    }

//    import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int number = 10;
//        int parts = 2;
//        int[] result = splitInteger(number, parts);
//        System.out.println(Arrays.toString(result));
//    }
//
//    public static int[] splitInteger(int number, int parts) {
//        int quotient = number / parts;
//        int remainder = number % parts;
//
//        int[] result = new int[parts];
//
//        for (int i = 0; i < parts; i++) {
//            if (i < remainder) {
//                result[i] = quotient + 1;
//            } else {
//                result[i] = quotient;
//            }
//        }
//
//        return result;
//    }
//}


