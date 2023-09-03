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

public class J02020 {

    /**
     * @param args the command line arguments
     */
    static int[] s = new int[15];
    static int a, b, cnt = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        Try(1);
        System.out.println("Tong cong co " + cnt +" to hop");
    }
    public static void Try(int j) {
        for(int i = s[j-1] + 1; i <= a - b + j; i++){
            s[j] = i;
            if(j == b) {
                in();
            } else {
                Try(j+1);
            }
        }
    }  
    public static void in() {
        cnt++;
        for(int i = 1; i <= b; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

}
