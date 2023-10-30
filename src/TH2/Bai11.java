/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            TreeSet<String> res = new TreeSet<>();
            int k = sc.nextInt();
            for(int n = 2; n <= k; n+=2){
                res.clear();
                int[] a = new int[n+2];
                Try(1, n, a, res);
                for(String i : res){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
    public static void Try(int i, int n, int[] a, TreeSet<String> res){
        for(int j = 0; j <=1; j++){
            a[i] = j;
            if(i == n){
                in(a, n, res);
            } else {
                Try(i+1, n, a, res);
            }
        }
    }
    public static void in(int[] a, int n, TreeSet<String> res){
        String s = "";
        String s1 = "";
        for(int i = 1; i <= n; i++){
            s += Integer.toString(a[i]);
            s1 = Integer.toString(a[i]) + s1;
        }
        if(s1.equals(s)){
            res.add(s);
        }
    }
}
