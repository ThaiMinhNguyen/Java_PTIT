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
public class J03015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);   
        BigInteger s1 = new BigInteger(sc.nextLine());
        BigInteger s2 = new BigInteger(sc.nextLine());
        BigInteger s3 = s1.subtract(s2);
        System.out.println(s3);
    }
}
