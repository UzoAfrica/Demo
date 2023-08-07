package org.example.week4.lambda;

import java.util.function.IntPredicate;

public class App6 {

//    public static void main(String[] args) {
//
//        IntPredicate lessThan18 = i -> i < 18;
//        IntPredicate MoreThan10 = i -> i > 10;
//
//        System.out.println(lessThan18.and(MoreThan10).test(45));
//
//    }


        public static void main(String[] args) {

            IntPredicate lessThan18 = i->i<18;
            IntPredicate MoreThan10 = i->i>10;

            new App6().demo(15, lessThan18, MoreThan10);

        }
        public void demo(int x, IntPredicate lessThan18, IntPredicate MoreThan10){
            if(lessThan18.and(MoreThan10).test(x)){
                System.out.println("The input is less Than 18 and more than 10");
            }else{
                System.out.println("invalid input");
            }
        }


    }
