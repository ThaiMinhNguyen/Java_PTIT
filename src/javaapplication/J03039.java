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

public class J03039 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-->0){
            BigInteger s1 = new BigInteger(sc.next());
            BigInteger s2 = new BigInteger(sc.next());
            boolean s3 = s1.mod(s2).equals(BigInteger.ZERO);
            boolean s4 = s2.mod(s1).equals(BigInteger.ZERO);
            if(s3 == true || s4 == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }   
    }
}
