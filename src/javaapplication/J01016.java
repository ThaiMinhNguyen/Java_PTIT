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
import java.io.*;

public class J01016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] s = a.toCharArray();
        int sum = 0;
        for(int i = 0; i < a.length(); i++){
            if(s[i] == '4' || s[i] == '7') {
                sum++;
            }
        }
        if(sum == 4 || sum == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
