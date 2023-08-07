package org.example.week4.lambda;

public class App2 {

    public static void main(String[] args) {

        //WITHOUT LAMBDA
//        Thread  thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I am inside thread 1");
//                System.out.println("This is line 2");
//            }
//        });
//        thread.start();

        //WITH LAMBDA
        new Thread(()->{
            System.out.println("I am inside thread 1");
            System.out.println("This is line 2");
        }).start();;

    }
}
