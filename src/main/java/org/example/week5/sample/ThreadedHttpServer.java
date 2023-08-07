package org.example.week5.sample;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedHttpServer {
    public static void main(String[] args) throws IOException {
        int port = 8000; // Specify the desired port number

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server listening on port " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            Thread clientThread = new ClientHandler(clientSocket);
            clientThread.start();
        }
    }
}

class ClientHandler extends Thread {
    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            handleClientRequest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleClientRequest() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String requestLine = in.readLine();
        String[] requestParts = requestLine.split(" ");
        String httpMethod = requestParts[0];
        String path = requestParts[1];

        if (httpMethod.equals("GET")) {
            if (path.equals("/")) {
                serveHtmlResponse(out, "index.html");
            } else if (path.equals("/json")) {
                serveJsonResponse(out, "data.json");
            } else {
                serveNotFoundResponse(out);
            }
        } else {
            serveNotFoundResponse(out);
        }

        in.close();
        out.close();
        clientSocket.close();
    }

    private void serveHtmlResponse(PrintWriter out, String fileName) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            String line;

            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html");
            out.println();

            while ((line = fileReader.readLine()) != null) {
                out.println(line);
            }

            fileReader.close();
        } else {
            serveNotFoundResponse(out);
        }
    }

    private void serveJsonResponse(PrintWriter out, String fileName) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            String line;

            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: application/json");
            out.println();

            while ((line = fileReader.readLine()) != null) {
                out.println(line);
            }

            fileReader.close();
        } else {
            serveNotFoundResponse(out);
        }
    }

    private void serveNotFoundResponse(PrintWriter out) {
        out.println("HTTP/1.1 404 Not Found");
        out.println("Content-Type: text/plain");
        out.println();
        out.println("404 Not Found");
    }
}

