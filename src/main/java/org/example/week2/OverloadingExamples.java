package org.example.week2;

public class OverloadingExamples {
    public void add(int a, int b){
        System.out.println("Add method with 2 Argument " + (a+b));
    }

    public void add(int a, int b, int c){
        System.out.println("Add method with 2 Argument " + (a+b+c));
    }
    public void add(int a, long b){
        System.out.println("Add method with 2 Argument " + (a+b));
    }
    // I cannot overload a method by changing the return type
//    public String add(int a, int b){
//
//    }

}
