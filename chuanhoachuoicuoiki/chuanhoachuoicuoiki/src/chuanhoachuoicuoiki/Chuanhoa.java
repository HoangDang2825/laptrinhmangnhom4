/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuanhoachuoicuoiki;
import java.math.BigInteger;
import java.rmi. server.UnicastRemoteObject;
import java.rmi.RemoteException;


/**
 *
 * @author DELL
 */
public class Chuanhoa extends UnicastRemoteObject implements ChuanHoaInterface{
    public static int i=0;
    public Chuanhoa() throws RemoteException {
        super();
    }
    public String chuanHoa(String str) {   
        str = str.replaceAll("\\s+", " ");
        str = str.replaceAll("[^A-Za-zA]+", " "); 
        str = str.replaceAll("^-?\\d+$", "");
        str = str.trim();
        return str;
    }
   public String chuanHoaDanhTuRieng(String str) {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = ""; 
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1).toLowerCase();
            if (i < temp.length - 1) 
                str += " ";
        }
        return str;
    }
    @Override
    public String AccessString(String str) {
        str = chuanHoaDanhTuRieng(str);
        return str;
    }
    public String Cong(String number1, String number2){
        BigInteger first  = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        String result = " "+first.add(second);
        
        return result;
    }
    public String Tru(String number1, String number2){
        BigInteger first  = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        String result = " "+first.subtract(second);
        return result;
    }
    public String Nhan(String number1, String number2){
        BigInteger first  = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        String result = " "+first.multiply(second);
        return result;
    }
    public String Chia(String number1, String number2){
        BigInteger first  = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        String result = " "+first.divide(second);
        return result;
    }  



    @Override
    public double cong(double number1, double number2) throws RemoteException {
        return  number1 + number2;
    }
        @Override
    public double chia(double number1, double number2 ){
        return  number1 / number2;
    }

    @Override
    public double tru(double number1, double number2) throws RemoteException {
        return  number1 - number2;
    }

    @Override
    public double nhan(double number1, double number2) throws RemoteException {
        return  number1 * number2;
    }


}
