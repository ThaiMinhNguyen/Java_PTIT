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

public class JKT014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            int[] res = new int[n+1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            a[0] = Integer.MAX_VALUE;
            Stack<Integer> s = new Stack<>();
            s.push(0);
            for(int i = 1; i <= n; i++){
                while(!s.isEmpty() && a[s.peek()] <= a[i]){
                    s.pop();
                }
                res[i] = i - s.peek();
                s.push(i);
            }
            for(int i = 1; i <= n; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }    
}
