package com.hillel.homeworks.hw17;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Sockets {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("jsonplaceholder.typicode.com", 80);
        System.out.println(socket.getLocalAddress());
        System.out.println(socket.getPort());
        System.out.println(socket.getLocalSocketAddress());
        System.out.println(socket.getLocalPort());
        socket.getKeepAlive();

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();


        String s = "GET /users HTTP/1.1\n" +
                "Host: jsonplaceholder.typicode.com\n" +
                "\n" +
                "\n";

        outputStream.write(s.getBytes(StandardCharsets.UTF_8));
        int ch;
        String text = "";
        try {
            while ((ch = inputStream.read()) != 0) {
                System.out.print((char) ch);
                text += (char) ch;
            }
        } catch (IOException e) {
            System.out.println("..................." + e);
        }

        Validator validator = new Validator();

        System.out.println("Validate = " + validator.validateBraces(text));
    }
}
