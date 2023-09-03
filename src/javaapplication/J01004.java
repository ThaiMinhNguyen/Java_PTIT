/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.Scanner;
import java.lang.Math;


public class J01004 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()) ;
        while(t-->0){
            int x = Integer.parseInt(sc.nextLine());
            if(check(x)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean check(int a){
        for(int i = 2; i <= (int)Math.sqrt(a); i++) {
            if(a % i == 0){
                return false;
            }
        }
        return a > 1;
    }
}
