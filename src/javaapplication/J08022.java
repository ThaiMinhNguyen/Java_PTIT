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
import java.io.*;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
        int t = sc.nextInt();
        while(t-->0){
//            int n = Integer.parseInt(sc.nextLine());
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            b[n-1] = -1;
            for(int i = 0 ; i < n; i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            st.push(a[n-1]);
            for(int i = n-2; i >= 0; i--){
                if(!st.empty() && a[i] < st.peek()){
                    b[i] = st.peek();
                    st.push(a[i]);
                } else {
                    while(!st.empty() && a[i] >= st.peek()){
                        st.pop();
                    }
                    if(!st.empty()){
                        b[i] = st.peek();
                        st.push(a[i]);
                    } else {
                        b[i] = -1;
                        st.push(a[i]);
                    }
                }
            }
            for(int i = 0 ; i < n; i++){
                System.out.print(b[i] + " ");
            }
//            for(Integer i : b){
//                System.out.print(i + " ");
//            }
            System.out.println();
        }
    }
}
