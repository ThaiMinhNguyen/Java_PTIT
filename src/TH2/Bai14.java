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
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long count = 0;
//        int[] a  = new int[t];
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < t; i++){
            a.add(sc.nextInt());
        }
        for(int i = 0; i < t-1; i++){
            for(int j = i+1; j < t; j++){
                if(j == i+1){
                    count++;
                    continue;
                }
                int s = Collections.max(a.subList(i+1, j));
                if(s <= a.get(i) && s <= a.get(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

//7
//2
//4
//1
//2
//2
//5
//1