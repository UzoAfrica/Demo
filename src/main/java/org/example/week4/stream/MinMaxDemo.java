package org.example.week4.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        Stream<Integer> openStream = arList.stream();
        Stream<Integer> filteredStream = openStream.filter(i -> i >= 20);
        Integer min = filteredStream.min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(min);

        System.out.println("Now in single line");

        Integer minValue = arList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(minValue);
        Integer maxValue = arList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(maxValue);
    }
}
