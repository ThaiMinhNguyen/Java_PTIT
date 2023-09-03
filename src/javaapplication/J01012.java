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

public class J01012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int x = Integer.parseInt(sc.nextLine());
            int sum = 0;
            if(x % 2 == 0) sum++;
            for(int i = 2; i <= (int)Math.sqrt(x); i++){
                if(x % i == 0){
                    if(i % 2 == 0){
                        sum++;
                    }
                    if(x/i % 2 == 0 && x/i != i){
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
