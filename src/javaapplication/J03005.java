/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String x = sc.nextLine();
            x = x.trim();
            x = x.toLowerCase();
            String[] s = x.split("\\s+");
            for(int i = 1; i < s.length-1; i++){
                System.out.print(String.valueOf(s[i].charAt(0)).toUpperCase() + s[i].substring(1)+ " ");
            }
            System.out.print(String.valueOf(s[s.length-1].charAt(0)).toUpperCase() + s[s.length-1].substring(1) + ", " + s[0].toUpperCase());
            System.out.println();
        }
    }
}
