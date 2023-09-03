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

public class J03032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] x = sc.nextLine().split("\\s+");
            for(String i : x){
//                char[] s = i.toCharArray();
                for(int j = i.length() - 1; j >= 0; j--) {
                    System.out.print(i.charAt(j));
                } 
                System.out.print(" ");
            }
            System.out.println();
        } 
    }
}
