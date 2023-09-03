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


public class J01022 {
    static long[] a = new long[93];
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        a[1] = 1;
        a[2] = 1;
        for(int i = 3; i <93; i++) {
            a[i] = a[i-2] + a[i-1];
        }
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int n = sc.nextInt();
            long l = sc.nextLong();
            System.out.println(tinh(n, l));
        }
    }
    
    public static char tinh(int x, long y) {
        if(x == 1) return '0';
        if(x == 2) return '1';
        if(y > a[x-2]) {
            return tinh(x-1, y - a[x-2]);
        } else {
            return tinh(x-2, y);
        }
    }
}
