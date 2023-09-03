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

public class J02011 {

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
        int check = 1;
        int buoc = 1;
        for(int i = 0; i < t-1; i++) {
            check = 0;
            min = i;
            for(int j = i+1; j<t; j++) {
//                min = a[j];
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            
            System.out.print("Buoc " + (i+1) + ":");
            buoc++;
            for(int j = 0; j < t; j++) {
                System.out.print(" " + a[j]);
            } 
            System.out.println();
              
        }
    }
}
