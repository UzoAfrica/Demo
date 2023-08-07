package org.example.algorithm;
import java.util.HashMap;
import java.util.Map;
public class Challenge {
        public static void main(String[] args) {
            System.out.println(numberToOrdinal(0)); // 0
            System.out.println(numberToOrdinal(1)); // 1st
            System.out.println(numberToOrdinal(2)); // 2nd
            System.out.println(numberToOrdinal(3)); // 3rd
            System.out.println(numberToOrdinal(4)); // 4th
            System.out.println(numberToOrdinal(11)); // 11th
            System.out.println(numberToOrdinal(21)); // 21st
            System.out.println(numberToOrdinal(112)); // 112th
        }

        public static String numberToOrdinal(int number) {
            if (number == 0) {
                return "0";
            }

            Map<Integer, String> ordinalSuffixes = new HashMap<>();
            ordinalSuffixes.put(1, "st");
            ordinalSuffixes.put(2, "nd");
            ordinalSuffixes.put(3, "rd");

            if (number % 100 >= 11 && number % 100 <= 13) {
                return number + "th";
            } else {
                int lastDigit = number % 10;
                return number + ordinalSuffixes.getOrDefault(lastDigit, "th");
            }
        }
    }
