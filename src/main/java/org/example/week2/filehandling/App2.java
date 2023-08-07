package org.example.week2.filehandling;

import java.io.*;

public class App2 {

    public static void main(String[] args) {
        {
//            File file = new File ("studyeasy");
//            file.mkdir();
//            file = new File ("studyeasy//team.txt");
//            try{
//                file.createNewFile();
//                System.out.println("File created");
//            } catch (IOException e) {
//                System.out.println("error occurred , while creating the file");
//            }

            File file = new File("/Users/decagon/Downloads/class1/src/main/java/org/example/week2/filehandling/studyeasy");
            file.mkdir();
            file = new File("/Users/decagon/Downloads/class1/src/main/java/org/example/week2/filehandling/studyeasy//team.txt");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write("Chaand");
                bw.newLine();
                bw.write("Shabaz");
                bw.newLine();
                bw.write("Sarrrlim");
                bw.newLine();
                bw.write("Praful");
                bw.newLine();
                bw.write("Aarti");
                System.out.println("Wrting onto the file completed");
                bw.close();

            } catch (IOException e) {
                System.out.println("error occurred , while creating the file");
            }

//                try {
//                    BufferedReader br = new BufferedReader(new FileReader("studyeasy\\team.txt"));
//                    String line;
//                    System.out.println("***********************");
//                    while ((line = br.readLine()) != null) {
//                        System.out.println(line);
//                    }
//                    br.close();
//                } catch (FileNotFoundException e) {
//                    System.out.println("FileNotFoundException");
//                } catch (IOException e) {
//                    System.out.println("IOException");
//                }
            }
        }
    }


