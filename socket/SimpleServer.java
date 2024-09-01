import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666); // Server listens on port 6666
            System.out.println("Server is waiting for client...");

            Socket socket = serverSocket.accept(); // Wait for a client to connect
            System.out.println("Client connected!");

            DataInputStream input = new DataInputStream(socket.getInputStream());
            String message = input.readUTF(); // Read the message from the client

            System.out.println("Client says: " + message);

            serverSocket.close(); // Close the connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
