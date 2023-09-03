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

public class J02004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int x = sc.nextInt();
            String s = "";
            String rv_s = "";
            for(int i = 0; i < x; i++) {
                char k = sc.next().charAt(0);
                s = s + k;
                rv_s = k + rv_s;
            }
//            System.out.println(s);
//            System.out.println(rv_s);
            if(s.equals(rv_s)) {
                System.out.println("YES"); 
            } else {
                System.out.println("NO");
            }
        }
    }
}
