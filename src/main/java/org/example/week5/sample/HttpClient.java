package org.example.week5.sample;

import java.io.*;
import java.net.Socket;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        String serverAddress = "localhost"; // Specify the server address
        int serverPort = 8000; // Specify the server port number

        Socket socket = new Socket(serverAddress, serverPort);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // Send GET request for HTML endpoint
        out.println("GET / HTTP/1.1");
        out.println("Host: " + serverAddress);
        out.println();

        // Read and print the response
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }

        System.out.println("------------");

        // Send GET request for JSON endpoint
        out.println("GET /json HTTP/1.1");
        out.println("Host: " + serverAddress);
        out.println();

        // Read and print the response
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }

        in.close();
        out.close();
        socket.close();
    }
}

