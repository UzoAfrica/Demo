//package org.example.week4.lambda.specialClass;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
////public class LambdaExpression {
//    /*
////    Java Lambda Expression Example*******************************************************************
//    interface Drawable{
//        public void draw();
//    }
//        public static void main(String[] args) {
////        WITHOUT LAMBDA
//            Drawable d1 = new Drawable() {
//                int width =10;
//                @Override
//                public void draw() {
//                    System.out.println("Drawing " + width);
//                }
//            };
//            d1.draw();
////            WITH LAMBDA_____________________________________________________________
//           *//* int width=10;
//
//            //with lambda
//            Drawable d2=()->{
//                System.out.println("Drawing "+width);
//            };
//            d2.draw();*//*
//        }*/
//
////    Java Lambda Expression Example: Single Parameter****************************************************
///*
//
//interface Sayable{
//    public String say(String name);
//}
//
//        public static void main(String[] args) {
//    //WITHOUT LAMBDA
//            Sayable s1 = new Sayable() {
//                @Override
//                public String say(String name) {
//                    return "Hello, " + name;
//                }
//            };
//            System.out.println(s1.say("Sonoo"));
//        }
//*/
//
////    WITH LAMBDA_____________________________________________________________________
//            /*// Lambda expression with single parameter.
//            Sayable s1=(name)->{
//                return "Hello, "+name;
//            };
//            System.out.println(s1.say("Sonoo"));
//
//            // You can omit function parentheses
//            Sayable s2= name ->{
//                return "Hello, "+name;
//            };
//            System.out.println(s2.say("Sonoo"));
//            */
//
////    Java Lambda Expression Example: Multiple Parameters***************************************************
//
//    /*interface Addable{
//    int add(int a,int b);
//}
////WITHOUT LAMBDA
//        public static void main(String[] args) {
//        Addable ad1 = new Addable() {
//         @Override
//             public int add(int a, int b) {
//        return a + b;
//                 }
//            };
//        System.out.println(ad1.add(10, 20));
//}*/
//
///*
//
////WITH LAMBDA________________________________________________________________
//
//
//            // Multiple parameters in lambda expression
//            Addable ad1=(a,b)->(a+b);
//            System.out.println(ad1.add(10,20));
//
//            // Multiple parameters with data type in lambda expression
//            Addable ad2=(int a,int b)->(a+b);
//            System.out.println(ad2.add(100,200));
//        }
//*/
////Java Lambda Expression Example: Foreach Loop*****************************************************
////    WITHOUT LAMBDA
///*
//        public static void main(String[] args) {
//            List<String> list = new ArrayList<String>();
//            list.add("SAMUEL");
//            list.add("PAUL");
//            list.add("LOVE");
//            list.add("JAMES");
//
//            for (int i = 0; i < list.size(); i++) {
//                String element = list.get(i);
//                System.out.println(element);
//            }
//        }*/
//
//    /*
////    WITH LAMBDA______________________________________________-________
//
//        public static void main(String[] args) {
//
//            List<String> list=new ArrayList<String>();
//            list.add("SAMUEL");
//            list.add("PAUL");
//            list.add("LOVE");
//            list.add("JAMES");
//
//            list.forEach(
//                    (n)->System.out.println(n)
//            );
////            for (String n : list) {
////            System.out.println(n);
////        }
//        }*/
//
////    Java Lambda Expression Example: Multiple Statements**************************************************
///*@FunctionalInterface
//interface Sayable{
//    String say(String message);
//}
//    //WITHOUT LAMBDA
//    public static void main(String[] args) {
//    Sayable person = new Sayable() {
//        @Override
//        public String say(String message) {
//            String str1 = "I would like to say, ";
//            String str2 = str1 + message;
//            return str2;
//        }
//    };
//
//    String result = person.say("Hello");
//        System.out.println(result);
//}*/
//
//   /*
//    //WITH LAMBDA_________________________________________________________________
//
//            // You can pass multiple statements in lambda expression
//            Sayable person = (message)-> {
//                String str1 = "I would like to say, ";
//                String str2 = str1 + message;
//                return str2;
//            };
//            System.out.println(person.say("time is precious."));
//        }*/
//
///*
//
//    //COMPARATOR*******************************************************************
//
//    class Product{
//        int id;
//        String name;
//        float price;
//        public Product(int id, String name, float price) {
//            super();
//            this.id = id;
//            this.name = name;
//            this.price = price;
//        }
//    }
//public class LambdaExpression {
//        public static void main(String[] args) {
//            List<Product> list=new ArrayList<Product>();
//
//            //Adding Products
//            list.add(new Product(1,"HP Laptop",25000f));
//            list.add(new Product(3,"Keyboard",300f));
//            list.add(new Product(2,"Dell Mouse",150f));
//
//            System.out.println("Sorting on the basis of name...");
////WITHOUT LAMBDA________________________________________________________
//            // Implementing basic Comparator
//            Collections.sort(list, new Comparator<Product>() {
//                @Override
//                public int compare(Product p1, Product p2) {
//                    return p1.name.compareTo(p2.name);
//                }
//            });
//
//            for (Product p : list) {
//                System.out.println(p.id + " " + p.name + " " + p.price);
//
//        }
//
//            //WITH LAMBDA________________________________________________________
//*/
///*
//            // implementing lambda expression
//            Collections.sort(list,(p1, p2)->{
//                return p1.name.compareTo(p2.name);
//            });
//            for(Product p:list){
//                System.out.println(p.id+" "+p.name+" "+p.price);
//            }*//*
//
//        }
//*/
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Stream;
//class Product{/*
//    int id;
//    String name;
//    float price;
//    public Product(int id, String name, float price) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//}
//public class LambdaExpression{
//    public static void main(String[] args) {
//        List<Product> list=new ArrayList<Product>();
//        list.add(new Product(1,"Samsung A5",17000f));
//        list.add(new Product(3,"Iphone 6S",65000f));
//        list.add(new Product(2,"Sony Xperia",25000f));
//        list.add(new Product(4,"Nokia Lumia",15000f));
//        list.add(new Product(5,"Redmi4 ",26000f));
//        list.add(new Product(6,"Lenevo Vibe",19000f));
//
////WITHOUT LAMBDA_____________________________________________________________
//        // Filtering data using basic Java method
//        List<Product> filteredData = new ArrayList<>();
//        for (Product product : list) {
//            if (product.price > 20000) {
//                filteredData.add(product);
//            }
//        }
//
//        // Iterating through the filtered collection
//        for (Product product : filteredData) {
//            System.out.println(product.name + ": " + product.price);
//        }*/
//
////        WITH LAMBDA
//
//        /*// using lambda to filter data
//        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);
//
//        // using lambda to iterate through collection
//        filtered_data.forEach(
//                product -> System.out.println(product.name+": "+product.price)
//        );*/
//    }
//
//
//
//
//}
//
//
