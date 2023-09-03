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
import java.io.*;

public class J02010 {

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
        int min;
        int check = 0;
        int buoc = 1;
        for(int i = 0; i < t; i++) {
            check = 0;
            for(int j = i+1; j<t; j++) {
                if(a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    check = 1;
                }
            }
            if(check == 1) {
                System.out.print("Buoc " + buoc + ":");
                buoc++;
                for(int j = 0; j < t; j++) {
                    System.out.print(" " + a[j]);
                } 
                System.out.println();
            }    
        }
//        String s = Arrays.toString(a);
//        System.out.println(s);
    }
}
