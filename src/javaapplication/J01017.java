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

public class J01017 {

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int check = 1;
            String s = sc.nextLine();
            char[] a = s.toCharArray();
            for(int i = 0; i < a.length-1; i++) {
                if(Math.abs(Character.getNumericValue(a[i]) - Character.getNumericValue(a[i+1])) != 1) {
                    check = 0;
                    break;
                }
            }
            if(check == 1){ 
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
