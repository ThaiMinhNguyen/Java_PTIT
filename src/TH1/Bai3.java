/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = Integer.parseInt(sc.nextLine());
            char[] s = sc.nextLine().toCharArray();
            int[][] a = new int[101][101];
            int ans = 0;
            for(int i = 1; i <= n; i++){
                for(int j = i+1; j <= n; j++){
                    if(s[i-1] == s[j-1]){
                        a[i][j] = a[i-1][j-1]+1;
                    } else {
                        a[i][j] = Integer.max(a[i-1][j],a[i][j-1]);
                    }
                    ans = Integer.max(ans, a[i][j]);
                }
            }
            System.out.println(ans);
        }
    }
}
