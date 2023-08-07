package org.example.algorithm;

//    A format for expressing an ordered list of integers is to use a comma separated list of either
//
//    individual integers
//    or a range of integers denoted by the starting integer separated from the end integer in the range
//    by a dash, '-'. The range includes all integers in the interval including both endpoints. It is not
//    considered a range unless it spans at least 3 numbers. For example "12,13,15-17".
//    Complete the solution so that it takes a list of integers in increasing order and returns a correctly
//    formatted string in the range format.
import java.util.ArrayList;
import java.util.List;

    public class ArrayRangeCompacting {
        public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 7, 8, 10, 15, 16, 17, 18, 20);
            String formattedString = formatRange(numbers);
            System.out.println(formattedString);
        }

        public static String formatRange(List<Integer> numbers) {
            StringBuilder sb = new StringBuilder();
            int size = numbers.size();

            for (int i = 0; i < size; i++) {
                int current = numbers.get(i);

                // Check if the next two numbers form a range
                if (i < size - 2 && numbers.get(i + 1) == current + 1 && numbers.get(i + 2) == current + 2) {
                    int rangeStart = current;

                    // Find the end of the range
                    while (i < size - 1 && numbers.get(i + 1) == numbers.get(i) + 1) {
                        i++;
                    }

                    int rangeEnd = numbers.get(i);
                    sb.append(rangeStart).append("-").append(rangeEnd).append(",");
                } else {
                    sb.append(current).append(",");
                }
            }

            // Remove the trailing comma and return the formatted string
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        }
    }

//import java.util.ArrayList;
//        import java.util.List;
//        import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 7, 8, 10, 15, 16, 17, 18, 20);
//        String formattedString = formatRange(numbers);
//        System.out.println(formattedString);
//    }
//
//    public static String formatRange(List<Integer> numbers) {
//        List<String> formattedList = new ArrayList<>();
//
//        int size = numbers.size();
//        int startRange = -1;
//
//        for (int i = 0; i < size; i++) {
//            int current = numbers.get(i);
//
//            // Check if the next two numbers form a range
//            if (i < size - 2 && numbers.get(i + 1) == current + 1 && numbers.get(i + 2) == current + 2) {
//                if (startRange == -1) {
//                    startRange = current;
//                }
//            } else {
//                if (startRange != -1) {
//                    formattedList.add(startRange + "-" + current);
//                    startRange = -1;
//                } else {
//                    formattedList.add(String.valueOf(current));
//                }
//            }
//        }
//
//        return formattedList.stream().collect(Collectors.joining(","));
//    }
//}

