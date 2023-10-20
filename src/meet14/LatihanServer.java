/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet14;

/**
 *
 * @author user
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LatihanServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int portNumber = 4444;
        try (
                ServerSocket serverSocket = new ServerSocket(portNumber); Socket clientSocket = serverSocket.accept(); PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); BufferedInputStream bis = new BufferedInputStream(clientSocket.getInputStream()); ObjectInputStream ois = new ObjectInputStream(bis);) {
            Pesan pesan;
            while ((pesan = (Pesan) ois.readObject()) != null) {
                System.out.println("Server Receive: " + pesan.toString());
                out.println("Pesan Diterima");
                if (pesan.getPesan().equalsIgnoreCase("exit")) {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(LatihanServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LatihanServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
