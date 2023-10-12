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

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = Integer.parseInt(sc.nextLine());
            Queue<String> q = new LinkedList<>();
            String s = "9";
            q.add(s);
            while(Long.parseLong(s) % n != 0){
                s = q.remove();
                q.add(s+'0');
                q.add(s+'9');
            }
            System.out.println(s);
        }
    }
}
