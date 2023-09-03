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

public class J03004 {

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
            for(String i : s) {
                    System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1)+ " ");
            }
            System.out.println();
        }
    }
}
