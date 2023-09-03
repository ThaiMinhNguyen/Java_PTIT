/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.math.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class J03013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-->0) {
            BigInteger s1 = new BigInteger(sc.next());
            BigInteger s2 = new BigInteger(sc.next());
            int l1 = s1.toString().length();
            int l2 = s2.toString().length();
            BigInteger s3 = s1.subtract(s2).abs();
            int l3 = Math.max(l1, l2);
            String res = String.valueOf(s3);
            while(res.length() < l3) {
                res = "0" + res;
            }
            System.out.println(res);
        }
    }
}
