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
public class Matrix {
    private int hang;
    private int cot;
    private int doi;
    private int[][] a;

    public Matrix(int hang, int cot, int doi, int[][] a) {
        this.hang = hang;
        this.cot = cot;
        this.doi = doi-1;
        this.a = a;
//        a = new int[hang][cot];
//        for(int i = 0; i < hang; i++){
//            for(int j = 0; j < cot; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
        change();
    }
    
    private void change(){
        ArrayList<Integer> s = new ArrayList<>();
        for(int i = 0; i < hang; i++){
            s.add(a[i][doi]);
        }
        Collections.sort(s);
        for(int i = 0; i < hang; i++){
            a[i][doi] = s.get(i);
        }
    }

//    @Override
//    public String toString() {
//        for(int i = 0; i < hang; i++){
//            for(int j = 0; j < cot; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
    
    
    public void print() {
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < cot; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }  
}
