/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_tren_lop.Bai2;

import java.util.*;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Set<Pair> s = new TreeSet<>();
        int[][] a = new int[t][t];
        for(int i = 0; i < t; i++){
            for(int j = 0; j < t ; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1){
                    s.add(new Pair(i+1, j+1));
                }
            }
        }
        for(Pair i : s){
            System.out.println(i);
        }
    }
}
//6
//0 1 1 0 1 0
//1 0 1 0 1 0
//1 1 0 1 0 0
//0 0 1 0 1 1
//1 1 0 1 0 1
//0 0 0 1 1 0