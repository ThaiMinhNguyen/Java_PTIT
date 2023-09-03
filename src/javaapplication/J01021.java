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


public class J01021 {

    static int m = (int)1e9 + 7;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        while(true){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println(tinh(a,b));
        }  
    }
    
    public static long tinh(long a, long b){
        long res = 1;
        while(b > 0) {
            if(b % 2 != 0) {
                res = res * a % m;
            }
            a = a * a % m;
            b /= 2;
        }
        return res;
    }
}
