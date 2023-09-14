/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        int [] a = new int[10000];
        ArrayList<Integer> ar = (ArrayList<Integer>)sc.readObject();
        for(Integer i : ar){
            a[i]++;
        }
        for(int i = 2; i < 10000; i++) {
            if(a[i] > 0 && isPrime(i)) {
                System.out.println(i + " " + a[i]);
            }
        }
    }
    
    public static boolean isPrime(int x){
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) {
                return false;
            }
        }
        return x > 1;
    }
}
