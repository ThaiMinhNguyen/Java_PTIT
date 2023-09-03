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

public class J03006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int check = 1;
            String k = sc.nextLine();
            char[] s = k.toCharArray();
            for(int i = 0; i < s.length/2; i++) {
                if(s[i] != s[s.length - 1 - i] || Integer.valueOf(s[i]) % 2 != 0) {
                    check = 0;
                    break;
                }
            }
            if(check == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
