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

public class J02103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int p = 1; p <= t; p++) {
           int n = sc.nextInt();
           int m = sc.nextInt();
           int[][] a = new int[n][m];
           int[][] b = new int[m][n];
           int[][] c = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    b[i][j] = a[j][i];
                }
            }
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    for(int l = 0; l < n; l++) {
                        c[i][l] += a[i][j]*b[j][l];
                    }
                }
            }
            System.out.println("Test " + p + ":");
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                 System.out.println();
            }
       }
    }
}
