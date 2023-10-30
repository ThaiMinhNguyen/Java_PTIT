/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.*;

public class J020356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = sc.nextInt();
        int b = s;
        if(9 * a < b || b < 1){
            System.out.print("-1 -1");
        } else {
            int n = 1;
            String res = "";
            String reverse_res = "";
            while(res.length() < a && b >= 0){
                while((b - n > (a - res.length() - 1) * 9) && n <= 9){
                    n++;
                }
//                System.out.println((a - res.length()) * 9);
                b-=n;
//                System.out.println(b);
                res += Integer.toString(n);
                n = 0;
            }
            n = 9;
            b = s;
            while(reverse_res.length() < a && b >= 0){
                while(b - n < 0 && n >= 0){
                    n--;
                }
                b-=n;
//                System.out.println(b);
                reverse_res += Integer.toString(n);
                n = 9;
            }
            System.out.print(res + ' ' + reverse_res);
        }
        
    }
}
