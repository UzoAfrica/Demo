package org.example.week4.predicateDemo;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Integer> squareMe = i -> System.out.println("Taking in an input performing square");
        squareMe.accept(5);
        Consumer<Integer> doubleMe = i -> System.out.println("Taking an input and performing doubling");
        doubleMe.accept(5);

        squareMe.andThen(doubleMe).accept(5);
    }
}
