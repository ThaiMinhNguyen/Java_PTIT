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

public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = sc.nextInt();
            Set<Character> r = new TreeSet<>();
            for(int i = 0; i < s.length(); i++){
                r.add(s.charAt(i));
            }
            if(26 - r.size() > n){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
