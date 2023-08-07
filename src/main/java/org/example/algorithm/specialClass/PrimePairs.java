package org.example.algorithm.specialClass;

//You are given an integer n. We say that two integers x and y form a prime number pair if:
//
//        1 <= x <= y <= n
//        x + y == n
//        x and y are prime numbers
//        Return the 2D sorted list of prime number pairs [xi, yi]. The list should be sorted in increasing order of xi. If there are no prime number pairs at all, return an empty array.
//
//        Note: A prime number is a natural number greater than 1 with only two factors, itself and 1.
//
//
//
//        Example 1:
//
//        Input: n = 10
//        Output: [[3,7],[5,5]]
//        Explanation: In this example, there are two prime pairs that satisfy the criteria.
//        These pairs are [3,7] and [5,5], and we return them in the sorted order as described in the problem statement.
//        Example 2:
//
//        Input: n = 2
//        Output: []
//        Explanation: We can show that there is no prime number pair that gives a sum of 2, so we return an empty array.
import java.util.ArrayList;
        import java.util.List;
public class PrimePairs {
    public static List<List<Integer>> primeNumberPairs(int n) {
        List<List<Integer>> pairs = new ArrayList<>();

        for (int x = 2; x <= n / 2; x++) {
            int y = n - x;

            if (isPrime(x) && isPrime(y)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(x);
                pair.add(y);
                pairs.add(pair);
            }
        }

        return pairs;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int n = 20;
        List<List<Integer>> primePairs = primeNumberPairs(n);

        if (primePairs.isEmpty()) {
            System.out.println("No prime number pairs found.");
        } else {
            System.out.println("Prime Number Pairs:");
            for (List<Integer> pair : primePairs) {
                System.out.println(pair.get(0) + ", " + pair.get(1));
            }
        }
    }

}
