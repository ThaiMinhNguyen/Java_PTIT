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

public class J03008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int check = 1;
            String k = sc.nextLine();
            char[] s = k.toCharArray();
            for(int i = 0; i < s.length/2; i++) {
                if(s[i] != s[s.length - 1 - i] || nto(Character.getNumericValue(s[i]))== false) {
                    check = 0;
                    break;
                }
            }
            if(check == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
    
    static boolean nto(int n) {
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
