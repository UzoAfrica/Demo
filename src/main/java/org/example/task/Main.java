package org.example.task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.example.task.Task.parseFile;

public class Main {
    public static void main(String[] args) {
        String filename = "application.properties";
        Map<String, String> fileValues = new HashMap<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
            while((line= bufferedReader.readLine())!= null){
                String[] lineArray = line.split("=");
                if(lineArray[0].contains("application")){
                    fileValues.put("application", lineArray[1]);
                }
                if(lineArray[0].contains("server")){
                    fileValues.put("port", lineArray[1]);
                }
                if(lineArray[0].contains("db.name")){
                    fileValues.put("dbName", lineArray[1]);
                }
                if(lineArray[0].contains("db.port")){
                    fileValues.put("dbPort", lineArray[1]);
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Failed to read file " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileValues.get("application"));


    }

}
