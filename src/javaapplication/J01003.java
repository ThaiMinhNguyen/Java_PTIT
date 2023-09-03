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

public class J01003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x == 0 && y == 0){
            System.out.println("VSN");
        }else if(x == 0){
            System.out.println("VN");
        }
        else{
            double z =  (double)-y/x;
            System.out.printf("%.2f", z);
        }
    }
}
