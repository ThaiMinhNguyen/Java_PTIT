/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT;

/**
 *
 * @author admin
 */
import java.util.*;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[l][l];
            int k = (int) n/2 + 1;
            int[][] res = new int[k][k];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
//            for(int i = 0; i < (int) )
        }
    }
}
