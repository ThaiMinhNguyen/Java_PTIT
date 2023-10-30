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

public class J02026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n+2];
            int[] b = new int[n+2];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a,1, n+1);
//            for(int i = 1; i <= n; i++){
//                System.out.println(a[i]);
//            }
            Try(1, n, k, a, b);
        }
    }
    
    public static void Try(int i, int n, int k,int[] a,  int[] b){
        for(int j = b[i-1] + 1; j <= n - k + i; j++){
            b[i] = j;
            if(i == k){
                in(k, a, b);
            } else {
                Try(i+1, n, k, a,  b);
            }
        }
    }
    
    public static void in(int k, int[] a, int[] b){
        for(int i = 1; i <= k; i++){
            System.out.print(a[b[i]] + " ");
        }
        System.out.println();
    }
}
