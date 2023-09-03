/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int check = 1;
            int sum = 0;
            String k = sc.nextLine();
            char[] s = k.toCharArray();
            if(s[0] != '8') check = 0;
            for(int i = 0; i < s.length/2; i++) {
                if(s[i] != s[s.length - 1 - i]) {
                    check = 0;
                    break;
                }
                sum+= Character.getNumericValue(s[i]);
            }
//            System.out.println(sum);
            if(check == 0 || sum % 10 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
