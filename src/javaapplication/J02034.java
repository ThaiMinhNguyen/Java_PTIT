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

public class J02034 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] s = new int[205];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            s[a[i]]++;
        }
        if(a[n-1] != n) {
            for(int i = 1; i < a[n-1]; i++) {
                if(s[i] == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Excellent!");
        }
    }
}
