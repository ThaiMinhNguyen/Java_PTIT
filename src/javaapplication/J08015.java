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

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            long sum = 0;
            int a = sc.nextInt();
            long b = sc.nextLong();
            long[] l = new long[a+1];
            Map<Long, Integer> c = new HashMap();
            for(int i = 0; i < a; i++){
                l[i] = sc.nextLong();
                if(c.containsKey(l[i])){
                    int x = c.get(l[i]);
                    c.put(l[i], x+1);
                } else {
                    c.put(l[i], 1);
                }
            }
//            for(int i = 0; i < a; i++){
//                System.out.println(l[i]);
//            }
            for(Long i : l){
                Long x = b - i;
                if(c.containsKey(x)){
                    if(i == x){
                        sum += c.get(x) - 1;
                    } else {
                        sum += c.get(x);
                    }
                }
            }
            System.out.println(sum/2);
        }
    }
}
