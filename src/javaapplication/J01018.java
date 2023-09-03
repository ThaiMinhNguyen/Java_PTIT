/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author admin
 */
public class J01018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int sum = 0;
            int check = 1;
            String s = sc.nextLine();
            char[] a = s.toCharArray();
            for(int i = 0; i < a.length-1; i++) {
                sum = sum + Character.getNumericValue(a[i]);
                if(Math.abs(Character.getNumericValue(a[i]) - Character.getNumericValue(a[i+1])) != 2) {
                    check = 0;
                    break;
                }
            }
//            System.out.println(Character.getNumericValue(a[a.length-1]));
            sum += Character.getNumericValue(a[a.length-1]);
//            System.out.println(sum);
            if(check == 1 && sum % 10 == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
