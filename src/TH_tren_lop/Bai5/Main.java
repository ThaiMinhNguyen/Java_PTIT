/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_tren_lop.Bai5;

import java.util.*;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();
        for(int i = 0; i<n; i++) a.add(sc.nextInt());
        for(int i = 0; i<m; i++) b.add(sc.nextInt());
        Set<Integer> giao = new TreeSet<>();
        Set<Integer> hieu1 = new TreeSet<>();
        Set<Integer> hieu2 = new TreeSet<>();
        giao.addAll(a);
        giao.retainAll(b);
        hieu1.addAll(a);
        hieu1.removeAll(b);
        hieu2.addAll(b);
        hieu2.removeAll(a);
        for(Integer i : giao){
            System.out.print(i + " ");
        }
        System.out.println();
        for(Integer i : hieu1){
            System.out.print(i + " ");
        }
        System.out.println();
        for(Integer i : hieu2){
            System.out.print(i + " ");
        }
    }
}
//5 6
//1 2 3 4 5
//3 4 5 6 7 8