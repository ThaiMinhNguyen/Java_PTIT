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

public class J02104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[t][t];
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < t; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < t; i++) {
            System.out.printf("List(%d) = " , (i+1));
            for(int j = 0; j < t; j++) {
                if(a[i][j] == 1) {
                    System.out.print(j+1 + " ");
                }
            }
            System.out.println();
        }
    }
}
