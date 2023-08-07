package org.example.week4;


    import java.util.function.Predicate;

public class PredicateInterfaces  {
        public static void main(String[] args) {
            Predicate<Integer> isDivisibleByTwo = (value) -> value % 2 == 0;
            Predicate<Integer> isDivisibleByFive = (value) -> value % 5 == 0;

            /*-------------- and() --------------*/
            System.out.println("--- and() ---");
            Predicate<Integer> isDivisibleByTwoAndFive
                    = isDivisibleByTwo.and(isDivisibleByFive);

            System.out.println("10 divisible by 2 and 5: "
                    + isDivisibleByTwoAndFive.test(10));
            System.out.println("4 divisible by 2 and 5: "
                    + isDivisibleByTwoAndFive.test(4));

            System.out.println();

            /*-------------- or() --------------*/
            System.out.println("--- or() ---");
            Predicate<Integer> isDivisibleByTwoOrFive
                    = isDivisibleByTwo.or(isDivisibleByFive);

            System.out.println("4 divisible 2 or 5: "
                    + isDivisibleByTwoOrFive.test(4));
            System.out.println("3 divisible 2 or 5: "
                    + isDivisibleByTwoOrFive.test(3));

            System.out.println();

            /*-------------- negate() --------------*/
            System.out.println("--- negate() ---");
            System.out.println("2 divisible by 2: "
                    + isDivisibleByTwo.negate());

            System.out.println();

            /*-------------- isEqual() --------------*/
            System.out.println("--- isEqual() ---");
            System.out.println("Tony equal to Stark: "
                    + Predicate.isEqual("Tony").test("Stark"));
        }
    }


