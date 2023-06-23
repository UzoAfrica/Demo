package org.example.week2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialize
        Employee e = new Employee();
        e.setId(1);
        e.setName("God is Good\n" + "DecaDev are great\n" + "I always gat Joy\n");

        String fileName = "ExampleFile.text";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);
        objectOutputStream.close();
        fileOutputStream.close();

        //Deserialize
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Employee reCreatedObj = (Employee) inputStream.readObject();
        System.out.println(reCreatedObj.getName());
        inputStream.close();
        fileInputStream.close();

    }

}
