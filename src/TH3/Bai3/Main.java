/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH3.Bai3;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t--> 0){
            int hang = sc.nextInt();
            int cot = sc.nextInt();
            int doi = sc.nextInt();
            int[][] a = new int[hang][cot];
            for(int i = 0; i < hang; i++){
                for(int j = 0; j < cot; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            Matrix k = new Matrix(hang, cot, doi, a);
//            Matrix k = new Matrix(sc, sc.nextInt(), sc.nextInt(), sc.nextInt());
            k.print();
        }
    }
}
