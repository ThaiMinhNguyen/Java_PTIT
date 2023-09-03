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

public class J03024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int check = 1;
            String s = sc.nextLine();
            char[] a = s.toCharArray();
            int sole = 0, sochan = 0;
            if(a[0] == '0') check = 0;
            for(int i = 0; i < a.length; i++) {
                if('0' > a[i] || a[i] > '9') {
                    check = 0;
                    break;
                }
                if(Character.getNumericValue(a[i])%2 == 0) {
                    sochan++;
                } else {
                    sole++;
                }
            }
            if(check == 0){
                System.out.println("INVALID");
            } else {
                if(a.length % 2 == 0 && sochan > sole) {
                    System.out.println("YES");
                } else if(a.length % 2 != 0 && sochan < sole) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
