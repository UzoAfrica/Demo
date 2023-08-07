package org.example.algorithm;

    import java.util.*;

    public class ShortestRoute {
        public static String[] reduceDirections(String[] plan) {
            Map<String, String> oppositeDirections = new HashMap<>();
            oppositeDirections.put("NORTH", "SOUTH");
            oppositeDirections.put("SOUTH", "NORTH");
            oppositeDirections.put("EAST", "WEST");
            oppositeDirections.put("WEST", "EAST");

            Stack<String> stack = new Stack<>();

            for (String direction : plan) {
                if (!stack.isEmpty() && oppositeDirections.get(stack.peek()).equals(direction)) {
                    stack.pop(); // Remove the opposite direction from the stack
                } else {
                    stack.push(direction); // Add the current direction to the stack
                }
            }

            return stack.toArray(new String[0]);
        }

        public static void main(String[] args) {
            String[] plan = {"NORTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
            String[] reducedPlan = reduceDirections(plan);
            System.out.println(Arrays.toString(reducedPlan)); // Output: [WEST]
        }
    }


