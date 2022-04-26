/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esclientserverba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Server {
    
    ServerSocket ss;
    Socket so;
    BufferedReader br;
    BufferedWriter bw;
    
    
    public Server(int Porta){
        int porta = 2000;
    try{
        ss = new ServerSocket(porta);
        System.out.println("");
    }catch(IOException ex){
        Logger.getLogger(Server.class.getName());
    }
    
    }
    
    public void inAscolto(){
      try{
        so = ss.accept();   
      }catch(IOException ex){
          Logger.getLogger(Server.class.getName());
      }
    }
    
    public void scrivi(String messaggio){
        try {
            bw = new BufferedWriter(new OutputStreamerWrite (so.getOutputStream()));
            bw.write(messaggio);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
