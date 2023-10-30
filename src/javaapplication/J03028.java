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

public class J03028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            String s = sc.next();
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2);
            System.out.println(merge(rotate(s1), rotate(s2)));
        }
    }
    public static String rotate(String s){
        String m = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            res += s.charAt(i) - 65;
        }
        String r = "";
        for(int i = 0; i < s.length(); i++){
            char k = m.charAt((s.charAt(i) - 65 + res)%26);
            r += k;
        }
        return r;
    }
    public static String merge(String s1, String s2){
        String m = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String r = "";
        for(int i = 0; i < s1.length(); i++){
            char k = m.charAt((s1.charAt(i) - 65 + s2.charAt(i) - 65)%26);
            r += k;
        }
        return r;
    }
}
//3
//EWPGAJRB
//BB
//TPQJDRJWSQXGRRIPXFMINTELHBJA