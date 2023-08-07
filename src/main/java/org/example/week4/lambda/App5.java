package org.example.week4.lambda;

import java.util.ArrayList;
import java.util.List;
//
//class Data5{
//    private String name;
//
//    public Data5(String name) {
//        super();
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Data [name=" + name + "]";
//    }
//
//    public String getName() {
//        return name;
//    }
//
//}
//
//public class App5 {
//
//    public static void main(String[] args) {
//        List<Data> list = new ArrayList<>();
//        list.add(new Data("Chaand"));
//        list.add(new Data("John"));
//        list.add(new Data("Mia"));
//        list.add(new Data("Angelica"));
//        list.add(new Data("Roy"));
//
//        list.forEach(temp -> {
//
//            System.out.println(temp.getName());
//        });
//
//
//    }

public class App5 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();{
            list.add(10);
            list.add(30);
            list.add(14);
            list.add(16);
            list.add(20);
            list.add(40);

//            for(Integer r : list){
//                if(r >= 16) {
//                    System.out.println(r);
//                }
//            }

            list.forEach(i-> System.out.println(i));

    }

}
}

