package org.example.week3.studentpriorityQueue;

import java.util.*;

public class PriorityQueueImp {

    public static List<Student> arrangeScoresDescending(List<Student> students) {
        List<Student> arrangedStudents = new ArrayList<>(students);

        for (int i = 0; i < arrangedStudents.size() - 1; i++) {
            for (int j = 0; j < arrangedStudents.size() - i - 1; j++) {
                Student currentStudent = arrangedStudents.get(j);
                Student nextStudent = arrangedStudents.get(j + 1);

                if (currentStudent.getScore() < nextStudent.getScore()) {
                    // Swap the students
                    arrangedStudents.set(j, nextStudent);
                    arrangedStudents.set(j + 1, currentStudent);
                }
            }
        }

        return arrangedStudents;
    }
}
