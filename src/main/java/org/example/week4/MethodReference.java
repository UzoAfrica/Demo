package org.example.week4;


    import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

            list.forEach(System.out::print);
        }
    }


