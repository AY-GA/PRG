package lekce_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class Server {
    static final int INITIAL = 9999;
    static ServerSocket serverSocket = null;

    public static void main(String[] args) throws IOException {
        try {
            serverSocket = new ServerSocket(INITIAL);
//            System.out.println("[SERVER] Waiting for client on port " + INITIAL + "...");

            var socket = serverSocket.accept();
            var in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            var out = new PrintWriter(socket.getOutputStream(), true);

//            System.out.println("[SERVER] Client connected. Waiting for port num...");
            int newPort = Integer.parseInt(in.readLine());

            serverSocket.close();
            serverSocket = new ServerSocket(newPort);
//            System.out.println("[SERVER] Waiting for connection at port " + newPort + "...");

            try {
                serverSocket.accept();
//                System.out.println("[SERVER] New client connected.");
                System.out.println("PING");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            serverSocket.close();
        }
    }
}
