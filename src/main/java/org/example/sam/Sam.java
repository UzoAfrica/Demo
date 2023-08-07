package org.example.sam;

import java.util.*;
public class Sam {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);



//Stream

        int sum = numbers.stream()

                //Intermediate operate

                .filter(n -> n % 2 == 0)

                .map(n -> n * 2)

                // Terminal operation

                .reduce(0, Integer::sum);



        System.out.println(sum); // Output: 12

    }
}
