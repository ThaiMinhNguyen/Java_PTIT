/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

import java.util.*;

/**
 *
 * @author admin
 */
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] r = new int[n+3];
        int[] l = new int[n+3];
        int[] h = new int[n+3];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
//        for(int i = 1; i <= n; i++){
//            System.out.println(h[i]);
//        }
//        st1.push(0);
        for(int i = 0; i < n ;i++){
            while(!st1.isEmpty() && h[st1.peek()] >= h[i]){
                st1.pop();
            }
            if(!st1.isEmpty()){
                l[i] = st1.peek() + 1;
            } else {
                l[i] = 0;
            }
            st1.push(i);
        }
//        for(int i = 1; i <= n; i++){
//            System.out.println(l[i]);
//        }

        st2.push(n - 1);
        for(int i = n-1; i > 0 ;i--){
            while(!st2.isEmpty() && h[st2.peek()] >= h[i]){
                st2.pop();
            }
            if(!st2.isEmpty()){
                r[i] = st1.peek() - 1;
            } else {
                r[i] = n-1;
            }
            st2.push(i);
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans = Long.max(ans, (long)h[i]*(r[i]-l[i] + 1));
        }
        System.out.println(ans);
    }
}

//5 9
//1 3 4 4 5 4 4 3 1