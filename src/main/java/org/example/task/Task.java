package org.example.task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class Task {
        public static String parseFile(String keyword) {
            String fileName = "ExampleFile.txt";
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("=");
                    String key = parts[0].trim();
                    String value = parts[1].trim();

                    if (key.equalsIgnoreCase(keyword)) {
                        reader.close();
                        return value;
                    }
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "";
        }

    }


