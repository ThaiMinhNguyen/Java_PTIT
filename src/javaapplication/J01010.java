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
import java.io.*;

public class J01010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ch = sc.nextLine();
            char[] x = ch.toCharArray();
            long sum = 0;
            int check = 0;
            for(int i = 0; i < ch.length(); i++) {
                if(x[i] == '0' || x[i] == '8' || x[i] == '9'){
                    sum*=10;
                } else if(x[i] == '1'){
                    sum = sum*10 + 1;
                } else {
                    check = 1;
                    System.out.println("INVALID");
                    break;
                }
            }
            if(check == 0 && sum > 0){
                System.out.println(sum);
            } else if(check == 0) {
                System.out.println("INVALID");
            }
        }
    }
}
