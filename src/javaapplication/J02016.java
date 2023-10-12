/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.*;
import java.lang.*;
import java.math.*;

/**
 *
 * @author admin
 */
public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            int check = 0;
            Arrays.sort(a);
            for(int i = 0 ; i < n; i++){
                for(int j = i+1; j < n; j++){
                    long k = (long) Math.sqrt(a[i]*a[i] + a[j]*a[j]);
                    if(k*k != a[i]*a[i] + a[j]*a[j]){
                        continue;
                    }
                    if(Arrays.binarySearch(a,k) > j){
                        check = 1;
                        break;
                    }
                }
                if(check == 1) break;
            }
            if(check == 0){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
