package org.example.algorithm;

//iorhgioergiorgiregir

    public class Mastify {
        public static void main(String[] args) {
            String originalString = "1567890";
            String maskedString = maskify(originalString);
            System.out.println(maskedString); // Output: ######7890
        }

        public static String maskify(String input) {
            int length = input.length();

            if (length <= 4) {
                return input;
            }

            StringBuilder masked = new StringBuilder();
            for (int i = 0; i < length - 4; i++) {
                masked.append('#');
            }

            masked.append(input.substring(length - 4));
            return masked.toString();
        }
    }
