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


public class J02027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long     sum = 0;
            int a = sc.nextInt(), b = sc.nextInt();
            int[] s = new int[a];
            for(int i = 0; i < a; i++){
                s[i] = sc.nextInt();
            }
            Arrays.sort(s);
            int l = 0;
            for(int i = 1; i < a; i++){
                while(l < i && s[l] + b <= s[i]){
                    l++;
                }
                sum+= i-l;
            }
            System.out.println(sum);
        }
    }
}
