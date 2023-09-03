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
public class J01007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()) ;
        while(t-->0){
            long a = Long.parseLong(sc.nextLine());
            if(check(a) == true){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean check(long n){
        long f1 = 0, f2 = 1, f3 = 0;
        if(n == 0) return true;
        for(int i = 2; i <= 92;i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            if(f3 == n){
                return true;
            }
        }
        return false;
    }
}
