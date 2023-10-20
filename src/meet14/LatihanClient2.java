/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet14;

/**
 *
 * @author user
 */

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LatihanClient2 {

    public static void main(String args[]) {
        String hostName = "localhost";
        int portNumber = 4444;
        try (
                Socket echoSocket = new Socket(hostName, portNumber); BufferedOutputStream bos = new BufferedOutputStream(echoSocket.getOutputStream()); ObjectOutputStream oos = new ObjectOutputStream(bos); BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream())); BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));) {
            String msg;
            while ((msg = stdIn.readLine()) != null) {
                oos.writeObject(new Pesan("Kadek", msg));
                oos.flush();
                System.out.println("Client receive: " + in.readLine());
                if (msg.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(LatihanClient2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
