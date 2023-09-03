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
import java.lang.*;


public class J01013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2000005];
        a[0] = a[1] = 1;
        for(int i = 2; i <= (int)Math.sqrt(2000000); i++){
            if(a[i] == 0){
                for(int j = 2*i; j <= 2000000;j+=i){
                    if(a[j] == 0){
                        a[j] = i;
                    }
                }
            }
        }
        for(int i = 2; i <= 2000000; i++){
            if(a[i] == 0){
                a[i] = i;
            }
        }

        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int x = Integer.parseInt(sc.nextLine());
            while(x > 1){
                sum += a[x];
                x /= a[x];
            }
        }
        System.out.println(sum);
    }
    
//    public static int tinh(int n){
//        int tong = 0; 
//        int chia = 2;
//        while(n > 1){
//            while(n % chia == 0){
//                tong += chia;
//                n /= chia;
//            }
//            chia++;
//        }
//        return tong;
//    }
}
