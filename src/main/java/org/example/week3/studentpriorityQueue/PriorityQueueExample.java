package org.example.week3.studentpriorityQueue;

import java.util.*;

import static org.example.week3.studentpriorityQueue.PriorityQueueImp.arrangeScoresDescending;

public class PriorityQueueExample {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Alice", 85));
            students.add(new Student("Bob", 92));
            students.add(new Student("Charlie", 78));
            students.add(new Student("David", 89));
            students.add(new Student("Emily", 95));

            // Arrange student scores in descending order
            List<Student> arrangedStudents = arrangeScoresDescending(students);

            // Print the arranged student scores
            for (Student student : arrangedStudents) {
                System.out.println(student.getName() + ": " + student.getScore());
            }
        }

    }



