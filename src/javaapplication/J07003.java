package javaapplication;


import java.io.*;
import java.math.BigInteger;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class J07003 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
//        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(s.length() > 1) { 
            int n = s.length();
            String f1 = s.substring(0, (int) n/2), f2 = s.substring((int) n/2);
            BigInteger s1 = new BigInteger(f1);
            BigInteger s2 = new BigInteger(f2);
            System.out.println(s1.add(s2));
            s = s1.add(s2).toString();
        }
    }
}
