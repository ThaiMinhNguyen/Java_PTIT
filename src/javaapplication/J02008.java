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


public class J02008 {

    /**
     * @param args the command line arguments
     */
    public static long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long[] LCM = new long[105];
        LCM[1] = 1;
        LCM[2] = 2;
        for(int i = 3; i <= 100; i++) {
            LCM[i] = (long) i * LCM[i - 1] / gcd((long) i, LCM[i - 1]);
        }
        
        int t = sc.nextInt();
        while(t-->0) {
            int x = sc.nextInt();
            System.out.println(LCM[x]);
        }
    }
    
    
    
}
