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
import java.lang.*;

public class J02022 {

    /**
     * @param args the command line arguments
     */
    static int n;
    static int[] a = new int[12];
    static int[] used = new int[12];
    
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            Try(1);
            System.out.println();
        }
    }
    
    public static void Try(int i) {
        for(int j = 1; j <= n; j++) {
            if(used[j] == 0) {
                a[i] = j;
                used[j] = 1;
                if(i == n) {
                    if(dk()) {
                        in();
                    }
                } else {
                    Try(i+1);   
                }
                used[j] = 0;
            }
        }
    }
    public static boolean dk(){
        for(int i = 1; i <= n-1; i++) {
            if(Math.abs(a[i] - a[i+1]) == 1){
                return false;
            }
        }
        return true;
    }
    
    public static void in() {
        for(int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    
    
}
