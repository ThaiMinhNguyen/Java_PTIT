/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH3;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Long> st = new Stack<>();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String[] res = new String[n];
            for(int i = 0; i < n; i++){
                res[i] = sc.next();
            }
            for(int i = n-1; i >= 0; i--){
                if(res[i].equals("-")){
                    long a = st.peek();
                    st.pop();
                    long b = st.peek();
                    st.pop();
                    st.push(a-b);
                } else if(res[i].equals("+")){
                    long a = st.peek();
                    st.pop();
                    long b = st.peek();
                    st.pop();
                    st.push(a+b);
                } else if(res[i].equals("*")){
                    long a = st.peek();
                    st.pop();
                    long b = st.peek();
                    st.pop();
                    st.push(a*b);
                } else if(res[i].equals("/")){
                    long a = st.peek();
                    st.pop();
                    long b = st.peek();
                    st.pop();
                    st.push(a/b);
                } else {
                    st.push(Long.parseLong(res[i]));
                }
            }
            System.out.println(st.peek());
        }
    }
}
//3
//7
//- + 2 * 3 1 9
//7
//- + 8 * 7 5 9
//3
//+ -10 -4