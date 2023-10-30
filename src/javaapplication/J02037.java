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

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ArrayList<Integer> a = new ArrayList<>();
            int chan = 0;
            String[] s = sc.nextLine().trim().split("\\s+");
//            for(String i : s){
//                System.out.println(i);
//            }
            for(String i : s){
                int l = Integer.parseInt(i);
                a.add(l);
                if(l % 2 == 0){
                    chan++;
                }
            }
            if(a.size() % 2 == 0 && chan > a.size() - chan){
                System.out.println("YES");
            } else if (a.size() % 2 != 0 && chan < a.size() - chan){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
