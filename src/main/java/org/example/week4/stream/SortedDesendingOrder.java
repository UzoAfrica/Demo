package org.example.week4.stream;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

public class SortedDesendingOrder {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        Stream<Integer> openStream = arList.stream();
        Stream<Integer> filteredStream = openStream.filter(i -> i >= 20);
        Stream<Integer> sortedStream = filteredStream.sorted((i1, i2) ->i2.compareTo(i1));
        sortedStream.forEach(x -> System.out.println(x));

        System.out.println("Now in Single line");

        Stream<Integer> newFilteredSortedList = arList.stream().sorted((i1, i2)-> i2.compareTo(i1));
        newFilteredSortedList.forEach(x -> System.out.println(x));
    }
}

