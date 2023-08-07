package org.example.algorithm.specialClass;

public class DelayedArriviedTime {
        public static String calculateArrivalTime(int arrivalTime, int delayedTime) {
            int totalHours = arrivalTime + delayedTime;
            if (totalHours >= 24) {
                totalHours %= 24;
            }
            String formattedTime = String.format("%02d:00", totalHours);
            return formattedTime;
        }

        public static void main(String[] args) {
            int arrivalTime = 8;
            int delayedTime = 4;
            String trainArrivalTime = calculateArrivalTime(arrivalTime, delayedTime);
            System.out.println("Train Arrival Time: " + trainArrivalTime);
        }
    }

