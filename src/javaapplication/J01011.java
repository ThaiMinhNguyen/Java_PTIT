/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.lang.*;


public class J01011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            long x = sc.nextLong(), y = sc.nextLong();
            long z = gcd(x, y);
            System.out.printf("%d %d", x*y/z, z);
            System.out.println();
        }
    }
    
    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }
        
}
