package org.example;

public class Dog {
    //Properties
    static String hospitalName = "xyz";
    static String color;
    String name;
    String breed;

    public Dog (){}

    //Methods
    public void wagTail(){
        System.out.println("Dog wag their Tail, every morning");
    }
    public void barking(){
        System.out.println("Dog barks at the gate");
    }
    public void eating(){
        System.out.println("Dog eats bone");
    }
    public  void printColor(){
        System.out.println(color);
    }
    public  void printName(){
        System.out.println(name);
    }
    public void specialCapability(){
        System.out.println("Dog barks");
    }

}
