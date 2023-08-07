package org.example.algorithm;

//Write a program to determine if a string contains all unique characters.
//        Return true if it does and false otherwise.
//        The string may contain any of the 128 ASCII characters.

public class AllCharacterAreUnique {
        public static void main(String[] args) {
            String input = "abcdefgf";
            boolean hasUniqueCharacters = hasUniqueCharacters(input);
            System.out.println(hasUniqueCharacters);
        }

//        public static boolean hasUniqueCharacters(String input) {
//            boolean[] charSet = new boolean[128];
//
//            for (int i = 0; i < input.length(); i++) {
//                int charValue = input.charAt(i);
//                if (charSet[charValue]) {
//                    return false; // Character is already encountered, not unique
//                }
//                charSet[charValue] = true;
//            }
//
//            return true; // All characters are unique
//        }
//    }

    public static boolean hasUniqueCharacters(String str) {
        return str.chars().distinct().count() == str.length();
    }
}
