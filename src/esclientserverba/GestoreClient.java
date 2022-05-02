/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esclientserverba;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class GestoreClient {
    
    public static void main(String[] args){
        
        try {
            Client cli = new Client(InetAddress.getLocalHost(), 2000);
            String messaggioLetto = cli.leggi();
            System.out.println(cli);
        } catch (UnknownHostException ex) {
            System.out.println("<cs> impossibile trovare local host");
        }
        
        
        }
    }

