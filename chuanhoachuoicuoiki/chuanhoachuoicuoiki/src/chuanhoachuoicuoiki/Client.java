/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuanhoachuoicuoiki;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.Scanner;
import java.rmi.RemoteException;
/**
 *
 * @author DELL
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
       
        String chuanhoaURL = "rmi://localhost:1090/Chuanhoa"; 
        ChuanHoaInterface object = null;
    try {
         ChuanHoaInterface chuanhoaItf = (ChuanHoaInterface) Naming.lookup("rmi://localhost:1090/Chuanhoa");
        System.out.println("Client ket noi voi server......");
        while (true) {
         Scanner sc = new Scanner(System.in);
        String chuanhoa;
        String number1;
        String number2;
        String calculation;
        System.out.println("-----------Moi ban chon yeu cau-----------");
        System.out.println("|           1: Chuan hoa chuoi.           |");
        System.out.println("|           2: Tinh toan 2 so lon,        |");
        System.out.println("|           3: Thoat chuong trinh.        |");
        System.out.println("------------------------------------------");
        String str = sc.nextLine();
        if(str.equals("3")){
            System.out.println("Client yeu cau ngat ket noi.......");
            break;
        }
        switch(str){
            case "1": System.out.print("Nhap chuoi can chuan hoa: ");
                      chuanhoa = sc.nextLine();
                      String result = chuanhoaItf.AccessString(chuanhoa);
                      System.out.print("Ke qua nhan tu server: ");
                      System.out.println(result);
                      break;
            case "2":System.out.print("Input number 1:");
                     number1 = sc.nextLine();
                     System.out.print("Input number 2:");
                     number2 = sc.nextLine();
                     System.out.print("input phep tinh( + - * /):");
                     calculation = sc.nextLine();
                     switch(calculation){
                         case "+" : System.out.println("Ket qua tra ve tu server:");
                                    System.out.println(chuanhoaItf.Cong(number1, number2));
                                    break;
                         case "-" : System.out.println("Ket qua tra ve tu server:");
                                    System.out.println(chuanhoaItf.Tru(number1, number2));
                                    break;
                         case "*" : System.out.println("Ket qua tra ve tu server:");
                                    System.out.println(chuanhoaItf.Nhan(number1, number2));
                                    break;
                         case "/" : System.out.println("Ket qua tra ve tu server:");
                                    System.out.println(chuanhoaItf.Chia(number1, number2));
                                    break;
                         default: System.out.println("Ban chon phep tinh sai!");
                                  break;
                     }
                     break;
            default: System.out.println("Lua chon khong ton tai!!");
                     break;            
        }
        }
    } catch (Exception e) { 
        System.out.println("Client Error :" + e);
    }
    }
    
}
