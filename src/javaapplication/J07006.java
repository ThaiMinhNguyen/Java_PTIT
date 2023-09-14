/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        int[] a = new int[1001];
        ArrayList<Integer> s = (ArrayList<Integer>) sc.readObject();
        for(int i = 0; i < s.size(); i++) {
            a[s.get(i)]++;
        }
        for(int i = 0 ; i <= 1000; i++) {
            if(a[i] > 0) {
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
