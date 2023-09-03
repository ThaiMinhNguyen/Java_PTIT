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

public class J01006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()) ;
        while(t-->0){
           int a = Integer.parseInt(sc.nextLine());
            System.out.println(fibo(a));
        }
    }
    
    public static long fibo(int n) {
        if(n <= 2){
            return 1;
        }
        long f1 = 1, f2 = 1;
        long f3 = 0;
        for(int i = 3; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }   
}
