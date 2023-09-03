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

public class J01005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()) ;
        while(t-->0){
           double n = sc.nextDouble(), h = sc.nextDouble();
           for(int i = 1; i < n; i++){
               System.out.printf("%.6f ", h*Math.sqrt(i/n));  
           }
           System.out.println();
        }
    }
}
