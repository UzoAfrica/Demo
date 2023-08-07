package org.example.week4.lambda;


    interface Lambda{
        public void demo();
    }

    public class App1 {

        public static void main(String[] args) {

            Lambda lambda = new Lambda() {
                @Override
                public void demo() {
                    System.out.println("Statement 1");
                    System.out.println("Statement 1");
                }
            };

//            Lambda lambda = ()->{
//                System.out.println("Statement 1");
//                System.out.println("Statement 2");
//            };
            lambda.demo();

        }
}
