/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.math.BigInteger;
import java.util.*;


public class J03012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            a = a.add(b);
            System.out.println(a);
        }
    }
}
