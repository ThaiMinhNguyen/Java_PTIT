/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.*;
//import java.io.*;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;
            ArrayList<String> a = new ArrayList<>();
            Queue<String> s = new LinkedList<>();
            String k = "";
            s.add("6");
            s.add("8");
            while(k.length() <= n){
                k = s.remove();
                if(k.length() > n) break;
                a.add(k);
                s.add(k + '6');
                s.add(k + '8');
                
            }
            Collections.reverse(a);
            System.out.println(a.size());
            for(String i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
