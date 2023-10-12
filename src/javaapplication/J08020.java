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

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int check = 1;
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if(st.empty()){
                    st.push(s.charAt(i));
                } else {
                    if(s.charAt(i) == '{' || s.charAt(i) == '('|| s.charAt(i) == '['){
                        st.push(s.charAt(i));
                    } else {
                        if(s.charAt(i) == '}' ){
                            if(st.peek() != '{'){
                                System.out.println("NO");
                                check = 0;
                                break;
                            } else {
                                st.pop();
                            }
                        }
                        if(s.charAt(i) == ')' ){
                            if(st.peek() != '('){
                                System.out.println("NO");
                                check = 0;
                                break;
                            }else {
                                st.pop();
                            }
                        }
                        if(s.charAt(i) == ']' ){
                            if(st.peek() != '['){
                                System.out.println("NO");
                                check = 0;
                                break;
                            }else {
                                st.pop();
                            }
                        }
                    }
                }
            }
            if(check == 1){
                System.out.println("YES");
            }
        }
    }
}
