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

public class J03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        while(t-->0){
            String s = sc.next();
            long res = m.get(s.charAt(0));
            for(int i = 1; i < s.length(); i++){
                long crt = m.get(s.charAt(i));
                long prev = m.get(s.charAt(i-1));
                if(prev < crt){
                    res += crt - 2*prev;
                } else {
                    res += crt;
                }
            }
            System.out.println(res);
        }
    }
}
