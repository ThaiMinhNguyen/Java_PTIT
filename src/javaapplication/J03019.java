/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.*;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        for(char c = 'z'; c >= 'a'; c--){
            for(int j = i; j < s.length(); j++){
                if(s.charAt(j) == c){
                    System.out.print(s.charAt(j));
                    i = j;
                }
            }
        }
    }
}
