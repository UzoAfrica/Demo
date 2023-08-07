package org.example.lectureOnOOP;

public class Main {
    public static void main(String[] args) {
        Dog bingo = new Dog();
        bingo.barking();
        bingo.eating();
        bingo.wagTail();
        System.out.println("Dog has " + bingo.leg + " legs");
        bingo.setName("James");
        System.out.println(bingo.getName());

        Labrador dog = new Labrador();
        dog.specialAbility();


        //Animal bb = new Animal();
        Overloading example = new Overloading();
        example.add(3,4, 5);


    }
}
