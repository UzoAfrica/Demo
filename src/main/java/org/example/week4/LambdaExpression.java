package org.example.week4;


    import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

            int sum = list.stream().reduce(0, (a, b) -> a + b);

            System.out.println(sum);
        }
    }


