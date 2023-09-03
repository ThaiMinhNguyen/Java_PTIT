/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.*;
import java.math.*;
import java.lang.*;

public class J03033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.nextLine());
       while(t-->0) {
           BigInteger s1 = new BigInteger(sc.nextLine());
           BigInteger s2 = new BigInteger(sc.nextLine());
           BigInteger s3 = s1.gcd(s2);
           s1 = s1.multiply(s2).divide(s3);
           System.out.println(s1);
       }
    }
}
