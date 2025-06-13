package lekce_28;

import java.io.*;
import java.net.*;

public class Klient {
    public static void main(String[] args) throws InterruptedException {
        final String HOST = "localhost";
        final int INITIAL_PORT = 9999;
        final int NEW_PORT = 8888;

        try {
            Socket socket = new Socket(HOST, INITIAL_PORT);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(NEW_PORT);
//            System.out.println("New port " + NEW_PORT + " sent.");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Thread.sleep(1000);

        try {
            Socket socket = new Socket(HOST, NEW_PORT);
            System.out.println("PONG");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
