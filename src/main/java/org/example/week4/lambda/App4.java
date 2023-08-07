package org.example.week4.lambda;

interface Lamda{
//    abstract public int demo();
    abstract public void demo();

}

public class App4 {
    public static void main(String[] args) {

        Lambda lambda = new Lambda(){
            int x = 10;
            public void demo(){
                System.out.println("Value of x: " + x);
            }
        };
        lambda.demo();

//        Lamda lamda = ()->{
//            System.out.println("Statement 1");
//            return 10;
//        };
//
//        System.out.println(lamda.demo());
    }

}
