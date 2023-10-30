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

public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int res = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] == n){
                    res = i;
                }
            }
            if(res == n-1){
                System.out.println("0");
            } else {
                System.out.println(res + 1);
            }
        }
    }
}
