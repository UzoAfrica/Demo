package org.example.algorithm;

//An ATM only has 100, 50 and 20 dollar bills (USD) available to be dispensed.
//        Given an amount between 40 and 10000 dollars (inclusive) and assuming that
//        the ATM wants to use as few bills as possible, determinate the minimal number
//        of 100, 50 and 20 dollar bills the ATM needs to dispense (in that order).

public class ATMCashWithdraw {
        public static void main(String[] args) {
            int amount = 2450;
            int[] billCounts = getBillCounts(amount);
            System.out.println("100 dollar bills: " + billCounts[0]);
            System.out.println("50 dollar bills: " + billCounts[1]);
            System.out.println("20 dollar bills: " + billCounts[2]);
        }

        public static int[] getBillCounts(int amount) {
            int[] billCounts = new int[3]; // index 0: 100 dollar bills, index 1: 50 dollar bills, index 2: 20 dollar bills

            billCounts[0] = amount / 100; // number of 100 dollar bills
            amount %= 100; // remaining amount after using 100 dollar bills

            billCounts[1] = amount / 50; // number of 50 dollar bills
            amount %= 50; // remaining amount after using 50 dollar bills

            billCounts[2] = amount / 20; // number of 20 dollar bills

            return billCounts;
        }
    }

//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args) {
//        int amount = 2450;
//        int[] billCounts = getBillCounts(amount);
//        System.out.println("100 dollar bills: " + billCounts[0]);
//        System.out.println("50 dollar bills: " + billCounts[1]);
//        System.out.println("20 dollar bills: " + billCounts[2]);
//    }
//
//    public static int[] getBillCounts(int amount) {
//        int[] billDenominations = {100, 50, 20};
//
//        int[] billCounts = Stream.of(billDenominations)
//                .map(denomination -> {
//                    int count = amount / denomination;
//                    amount %= denomination;
//                    return count;
//                })
//                .toArray();
//
//        return billCounts;
//    }
//}

