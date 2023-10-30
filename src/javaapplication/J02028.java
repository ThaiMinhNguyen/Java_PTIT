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

public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int check = 0;
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            long crtsum = a[0];
            int start = 0;
            for(int i = 1; i <= n; i++){
                while(crtsum > k && start < i - 1){
                    crtsum -= a[start];
                    start++;
                }
                if(crtsum == k){
                    check = 1;
                    break;
                }
                if(i < n){
                    crtsum += a[i];
                }
            }
            if(check == 1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
