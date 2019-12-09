/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuanhoachuoicuoiki;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author DELL
 */
public class DServer {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, MalformedURLException {
//        if (System.getSecurityManager() == null) { 
//         System.setSecurityManager(new SecurityManager());
//        }
//        try {
//            Chuanhoa obj = new Chuanhoa(); 
//            Naming.rebind("rmi://localhost/ChuanhoaObject", obj); 
//            System.out.println("Server ready!");
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }
        LocateRegistry.createRegistry(1090);
        Naming.rebind("rmi://localhost:1090/Chuanhoa", new Chuanhoa()); 
    
    
    }
    
}
