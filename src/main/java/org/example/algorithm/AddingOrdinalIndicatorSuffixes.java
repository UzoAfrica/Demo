package org.example.algorithm;

//        Finish the function numberToOrdinal, which should take a number and return it as a string
//        with the correct ordinal indicator suffix (in English). For example, 1 turns into "1st".
//
//        For the purposes of this challenge, you may assume that the function will always be passed
//        a non-negative integer. If the function is given 0 as an argument, it should return the string
//        "0" without a suffix

    public class AddingOrdinalIndicatorSuffixes {
        public static void main(String[] args) {
            int number = 32;
            String ordinal = numberToOrdinal(number);
            System.out.println(ordinal);
        }

        public static String numberToOrdinal(int number) {
            if (number == 0) {
                return "0";
            }

            if (number >= 11 && number <= 13) {
                return number + "th";
            }

            int lastDigit = number % 10;
            String suffix;

            switch (lastDigit) {
                case 1:
                    suffix = "st";
                    break;
                case 2:
                    suffix = "nd";
                    break;
                case 3:
                    suffix = "rd";
                    break;
                default:
                    suffix = "th";
                    break;
            }

            return number + suffix;
        }
    }

//public class Main {
//    public static void main(String[] args) {
//        int number = 1;
//        String ordinal = numberToOrdinal(number);
//        System.out.println(ordinal);
//    }
//
//    public static String numberToOrdinal(int number) {
//        if (number == 0) {
//            return "0";
//        }
//
//        return number + getSuffix(number);
//    }
//
//    public static String getSuffix(int number) {
//        if (number >= 11 && number <= 13) {
//            return "th";
//        }
//
//        int lastDigit = number % 10;
//
//        return switch (lastDigit) {
//            case 1 -> "st";
//            case 2 -> "nd";
//            case 3 -> "rd";
//            default -> "th";
//        };
//    }
//}
