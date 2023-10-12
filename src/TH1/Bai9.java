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

public class Bai9 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer>[] cot = new ArrayList[m];
            for(int i = 0; i < m; i++){
                cot[i] = new ArrayList<>();
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    cot[j].add(sc.nextInt());
                }
            }
            Collections.sort(cot[k-1]);
            for(int i = 0; i <n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(cot[j].get(i) + " ");
                }
                System.out.println();
            }
        }
    }
}
