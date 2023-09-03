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

public class J02106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[t][3];
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < t; i++) {
            int tinh = 0;
            for(int j = 0; j < 3; j++) {
                if(a[i][j] == 1) {
                    tinh++;
                }
            }
            if(tinh > 3 - tinh) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
