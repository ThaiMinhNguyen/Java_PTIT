/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*; 

public class J07008 {
    static int[] a;
    static int[] b;
    static int n;
    static ArrayList<String> s = new ArrayList<>();
    
    public static void Try(int i){
        for(int j = 0; j <= 1; j++) {
            a[i] = j;
            if(i == n-1) {
//                System.out.println(Arrays.toString(a));
                if(in()){
                    String res = "";
                    for(int l = 0; l < n; l++){
                        if(a[l] == 1) {
                            res += Integer.toString(b[l]) + " ";
                        }
                    }
                    s.add(res);
                }
            } else {
                Try(i+1);
            }
        }
    }
    
    public static boolean in(){
        List<Integer> k = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(a[i] == 1) {
                k.add(b[i]);
            }
        }
        if(k.size() < 2) return false;
        for(int i = 0; i < k.size() - 1; i++) {
            if(k.get(i) > k.get(i+1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
//        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Try(0);
        Collections.sort(s);
        for(String i : s){
            System.out.println(i);
        }
    }
}
