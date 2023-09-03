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
import java.lang.*;

public class J01014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long x = sc.nextLong();
            long mx = 0;
            for(int i = 2; i <= (int)Math.sqrt(x); i++){
                if(x % i == 0){
                    mx = Math.max(mx, i);
                    while(x % i == 0){
                        x = x / i;
                    }
                }
            }
            mx = Math.max(mx, x);
            System.out.println(mx);
        }
    }
      
}
