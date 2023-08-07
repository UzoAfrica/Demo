package org.example.week4.stream;

import java.util.stream.Stream;

public class OfDemo {
    public static void main(String[] args) {
        Stream.of(1,11,11,111,11111).forEach(x -> System.out.println(x));

        String[] name = {"Code", "Decagon", "Demos"};
        Stream.of(name).filter(x-> x.length() > 4).forEach(x -> System.out.println(x));
    }
}
