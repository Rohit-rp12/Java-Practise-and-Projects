import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666); // Connect to server at localhost on port 6666

            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            output.writeUTF("Hello Server!"); // Send a message to the server

            socket.close(); // Close the connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
