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

public class J03040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String a = sc.nextLine().replace(".", "");
            char[] s = a.toCharArray();
            int[] k = new int[10];
            k[5] = s[5] - '0';
            k[6] = s[6] - '0';
            k[7] = s[7] - '0';
            k[8] = s[8] - '0';
            k[9] = s[9] - '0';
//            for(int i = 5; i <= 9 ; i++) {
//                System.out.println(k[i]);
//            }
            if(Check(k) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean Check(int[] s) {
        if(s[5] == s[6] && s[6] == s[7] && s[7] == s[8] && s[8] == s[9]) {
            return true;
        } else if(s[5] == s[6] && s[6] == s[7] && s[8] == s[9]){
            return true;
        } else if (s[5] < s[6] && s[6] < s[7] && s[7] < s[8] && s[8] < s[9]) {
            return true;
        } else {
            for(int i = 5; i <= 9; i++) {
                if(s[i] != 6 && s[i] != 8) {
                    return false;
                }
            }
            return true;
        }
    }
}
