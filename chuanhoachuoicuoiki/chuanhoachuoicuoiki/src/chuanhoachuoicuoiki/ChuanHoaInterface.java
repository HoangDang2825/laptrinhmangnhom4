/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuanhoachuoicuoiki;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author DELL
 */
public interface ChuanHoaInterface  extends Remote {
    String AccessString(String str) throws RemoteException;
    String Cong(String number1, String number2) throws RemoteException;
    String Tru(String number1, String number2) throws RemoteException;
    String Nhan(String number1, String number2) throws RemoteException;
    String Chia(String number1, String number2) throws RemoteException;
    public double cong (double  number1, double number2) throws RemoteException;
    public double tru (double  number1, double number2) throws RemoteException;
    public double nhan (double  number1, double number2) throws RemoteException;
    public double chia (double  number1, double number2) throws RemoteException;
}
