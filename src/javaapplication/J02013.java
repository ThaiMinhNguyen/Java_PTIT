/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02013 {

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for(int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        int check = 0;
        int buoc = 1;
        while(check == 0) {
            check = 1;
            for(int i = 0; i < t-1; i++) {
                if(a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    check = 0;
                }
            }   
            if(check == 0) {
                System.out.print("Buoc " + buoc + ":");
                buoc++;
                for(int j = 0; j < t; j++) {
                    System.out.print(" " + a[j]);
                } 
                System.out.println();
            } 
        }                
    }
}
