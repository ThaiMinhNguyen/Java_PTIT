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


public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> x = new Stack<>();
        Stack<Character> y = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '-'){
                if(!x.isEmpty()){
                    x.pop();
                }
            }
            else if(s.charAt(i) == '>'){
                if(!y.isEmpty()){
                    x.push(y.peek());
                    y.pop();
                }
            }
            else if(s.charAt(i) == '<'){               
                if(!x.isEmpty()){
                    y.push(x.peek());
                    x.pop();
                }
            }
            else{
                x.push(s.charAt(i));
            }
        }
        while(!x.isEmpty()){
            y.push(x.peek());
            x.pop();
        }
        while(!y.isEmpty()){
            System.out.print(y.peek());
            y.pop();
        }
    }
}
