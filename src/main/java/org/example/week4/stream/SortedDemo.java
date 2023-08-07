package org.example.week4.stream;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        //get Stream object
        Stream<Integer> openStream = arList.stream();
        //Configure stream by filtering out required values
        Stream<Integer> filteredStream = openStream.filter(i -> i >= 20);
        //Sort on any stream filter or mapped or on normal stream
        Stream<Integer> sortedStream = filteredStream.sorted();
        sortedStream.forEach(x -> System.out.println(x));

        System.out.println("Now in Single line");

        Stream<Integer> newFilteredSortedList = arList.stream().filter(i -> i >=20).sorted();
        newFilteredSortedList.forEach(x -> System.out.println(x));
    }
}

