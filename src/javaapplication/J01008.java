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

public class J01008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()) ;
        for(int i = 1; i <= t; i++){
            
            int a = Integer.parseInt(sc.nextLine());
            int sum = 0;
            int chia = 2;
            System.out.printf("Test %d: ",i);
            while(a > 0){
                if(a % chia == 0){
                    sum++;
                    a=a/chia;
                } else {
                    if(sum > 0){
                        System.out.printf("%d(%d) ", chia, sum);
                    }
                    chia++;
                    sum = 0;
                    if(a == 1){
                        System.out.println("");
                        break;
                    }
                }
            }
        }
    }
}
