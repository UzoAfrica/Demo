package org.example;

import org.example.week2.Labrador;
import org.example.week2.OverloadingExamples;

public class Main {
    public static void main(String[] args) {


        //Create a dog object
        Dog bingo = new Dog();
        bingo.specialCapability();
//        bingo.barking();
//        bingo.color = "black";
//        bingo.printColor();
//        System.out.println(bingo.color);
//        System.out.println(Dog.hospitalName);
//
//        Dog jack = new Dog();
//        jack.eating();
//        jack.color= "blue";
//        jack.printColor();
//        jack.name= "Roo";
//        jack.printName();
//
//        OverloadingExamples examples = new OverloadingExamples();
//        examples.add(2,3);
//        examples.add(2,3,4);

        Labrador labrador = new Labrador();
        labrador.specialCapability();
    }


}