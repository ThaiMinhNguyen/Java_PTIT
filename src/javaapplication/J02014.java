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

public class J02014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int sum = 0;
            int[] a = new int[n+1];
            for(int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                sum = sum + a[i];
            }
//            System.out.println(sum);
            int res = -1;
            int div = 0;
            for(int i = 1; i <= n; i++) {
                if(div*2 +a[i] == sum) {
                    res = i;
                    break;
                }
                div+=a[i];
            }
            System.out.println(res);
        }
    }
}


