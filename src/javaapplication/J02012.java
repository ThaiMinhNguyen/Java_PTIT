/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.util.*;

/**
 *
 * @author admin
 */
public class J02012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for(int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> sa = new ArrayList<Integer>();
        for(int i = 0; i < t; i++) {
            sa.add(a[i]);
            System.out.print("Buoc " + i + ":");
            Collections.sort(sa);
            for(int x : sa) {
                System.out.print(" " + x);
            }
            System.out.println();
              
        }
    }
}
