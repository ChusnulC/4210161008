/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clent;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


public class Client {
    
    class Data {
        private String status;
        private int id_player;
        private float posX;
        private float posY;
        private float posZ;
}

    public static void main(String args[]) throws IOException 
    { 
        //Data atribut = new Data();
        Scanner sc = new Scanner(System.in); 
        
        DatagramSocket ds = new DatagramSocket(); 
  
        InetAddress ip = InetAddress.getLocalHost(); 
        byte buf[] = null; 
          
        while (true) 
        { 
            String inp = sc.nextLine(); 
             
            buf = inp.getBytes(); 
          
            DatagramPacket DpSend = 
                  new DatagramPacket(buf, buf.length, ip, 1234); 
              
            ds.send(DpSend); 
 
            if (inp.equals("bye")) 
                break; 
        } 
    } 
    
}
