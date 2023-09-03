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

public class J03025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int sum = 0;
            char[] s = sc.nextLine().toCharArray();
            for(int i = 0; i < s.length / 2; i++){
                if(s[i] != s[s.length-1-i]) {
                    sum++;
                }
                if(sum > 1){
                    break;
                }
            }
            if(sum == 1) {
                System.out.println("YES");
            } else if (sum == 0 && s.length % 2 != 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
