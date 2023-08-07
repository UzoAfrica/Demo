package org.example.week2.filehandling;

import java.io.File;
import java.io.IOException;

public class App1 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/decagon/Downloads/class1/src/main/java/org/example/week2/filehandling/Study Easy");
        {
            file.createNewFile();
            System.out.println("File Created");
        }
    }
}
