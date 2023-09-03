/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class J01009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        System.out.print(tinh(x));
    }
    
    public static long tinh(int n){
        long sum = 1;
        long res = 0;
        for(int i = 1; i <= n; i++) {
            sum *= i;
            res += sum;
        }
        return res;
    }
    
}
