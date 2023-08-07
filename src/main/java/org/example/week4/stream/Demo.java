package org.example.week4.stream;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

//        Stream<Integer> openStream = arList.stream();
//        Stream<Integer> filteredStream = openStream.filter(i -> i >= 20);
//        long streamCount = filteredStream.count();
//        System.out.println(streamCount);

        System.out.println("Now in Single line");
//       long newFilteredListCount = arList.stream().filter(i -> i >= 20).count();
       long newFilteredListCount = arList.stream().count();
        System.out.println(newFilteredListCount);
    }
}
