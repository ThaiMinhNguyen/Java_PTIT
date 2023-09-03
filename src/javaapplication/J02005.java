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


public class J02005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int a[] = new int[1001];
        int b[] = new int[1001];
        for(int i = 0; i < n; i++) {
            a[sc.nextInt()]++;
        }
        for(int i = 0; i < m; i++) {
            b[sc.nextInt()]++;
        }
        for(int i = 0; i < 1000; i++) {
            if(a[i] > 0 && b[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
