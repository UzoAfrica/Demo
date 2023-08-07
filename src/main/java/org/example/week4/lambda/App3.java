package org.example.week4.lambda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
        private String name;

        public Data(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Data [name=" + name + "]";
        }

    }

    public class App3 {

        public static void main(String[] args) {
            List<Data> list = new ArrayList<>();
            list.add(new Data("Charles"));
            list.add(new Data("Ay"));
            list.add(new Data("Emmanuella"));
            list.add(new Data("Monday"));
            list.add(new Data("Peter"));


            //WITHOUT LAMBDA
//             Collections.sort(list, new Comparator<Data>() {
//             @Override
//             public int compare(Data o1, Data o2) {
//                 return o1.getName().compareTo(o2.getName());
//             }
//             });

            //WITH LAMBDA
//            Collections.sort(list, (Data o1, Data o2) -> o1.getName().compareTo(o2.getName()));

            //WITH LOGIC
            Collections.sort(list, (Data o1, Data o2) -> {

                if(o1.getName().length() < o2.getName().length()){
                    return -1;
                }else if(o1.getName().length() > o2.getName().length()){
                    return 1;
                }else{
                    return 0;
                }

            });

            for (Data data : list) {
                System.out.println(data.getName());
            }

        }
    }
