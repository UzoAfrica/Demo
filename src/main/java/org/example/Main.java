package org.example;

public class Main {
    public static void main(String[] args) {

        //Create a dog object
        Dog bingo = new Dog();
        bingo.barking();
        bingo.color = "black";
        bingo.printColor();

        Dog jack = new Dog();
        jack.eating();
        jack.color= "white";
        jack.printColor();
        jack.name= "Hoo";
        jack.printName();
    }
}