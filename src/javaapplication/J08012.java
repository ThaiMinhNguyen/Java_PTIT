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
import java.io.*;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [] canh = new int[n+2];
        for(int i = 0; i <n-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            canh[a]++;
            canh[b]++;
        }
        int check = 1;
        for(int i = 1; i <= n; i++){
            if(canh[i]!= 1 && canh[i] != n-1){
                System.out.println("No");
                check = 0;
                break;
            }
        }
        if(check == 1){
            System.out.println("Yes");
        }
    }
}
