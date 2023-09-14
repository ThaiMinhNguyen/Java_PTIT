/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.io.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class J07004 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] a = new int[1001];
        while(sc.hasNext()) {
            a[sc.nextInt()]++;
        }
        for(int i = 0 ; i <= 1000; i++) {
            if(a[i] > 0) {
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
