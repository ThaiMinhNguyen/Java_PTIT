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

public class J02007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 1; j <= t; j++) {
            System.out.println("Test " + j + ":");
            int a[] = new int[100005];
            int n = sc.nextInt();
            int b[] = new int[n];
            for(int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                a[b[i]]++;
            }
            for(int i = 0; i < n; i++) {
               if(a[b[i]] > 0) {
                   System.out.println(b[i] + " xuat hien " + a[b[i]] + " lan");
                   a[b[i]] = 0;
               }
            }
        }   
    }
}
