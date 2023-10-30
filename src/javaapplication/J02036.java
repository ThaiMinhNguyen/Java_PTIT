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

public class J02036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n+1];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            b[0] = a[0];
            for(int i = 1; i < n; i++){
                b[i] = lcm(a[i], a[i-1]);
            }
            b[n] = a[n-1];
            for(int i = 0 ; i < n+1; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    static long lcm(long a, long b) 
    { 
        return (a / gcd(a, b)) * b; 
    } 
}

//2
//3
//1 2 3
//3
//5 10 5