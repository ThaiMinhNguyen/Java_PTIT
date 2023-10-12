/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.*;

/**
 *
 * @author admin
 */
public class J02025 {
     public static ArrayList<String> s = new ArrayList<>();
//    public static ArrayList<Integer> a = new ArrayList<>();
    public static int[] r = new int[20];
    public static Integer[] a = new Integer[20];
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            s.clear();
            n = sc.nextInt();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, 0, n, Comparator.reverseOrder());
            Try(0);
//            Collections.sort(s);
//            for(String i : s){
//                System.out.println(i);
//            }
        }
    }
    public static void Try(int i){
        for(int j = 0; j <= 1; j++){
            r[i] = j;
            if(i == n-1){
                in();
            } else {
                Try(i+1);
            }
        }
    }
    
    public static void in(){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i] * r[i];
        }
        if(isPrime(sum)){
            for(int i = 0; i < n; i++){
                if(r[i] == 1)
                    System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
    }
    
    public static boolean isPrime(int h){
        if(h < 2) return false;
        for(int i = 2; i <= (int) Math.sqrt(h); i++){
            if(h % i ==0) return false;
        }
        return true;
    }
}
