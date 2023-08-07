package org.example.week4.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        Stream<Integer> openStream = arList.stream();
        Stream<Integer> filteredStream = openStream.filter(i -> i >= 20);
        List<Integer> newFilteredListOrigin = filteredStream.collect(Collectors.toList());
        newFilteredListOrigin.stream().forEach(x -> System.out.println(x));

        System.out.println("Now in Single line");
        List <Integer> newFilteredList = arList.stream().filter(i -> i >= 20).collect(Collectors.toList());
        newFilteredList.forEach(x -> System.out.println(x));
    }
}
