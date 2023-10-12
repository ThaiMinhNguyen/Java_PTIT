/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;

public class Bai2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
//        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
//            int n = Integer.parseInt(sc.nextLine());
            int n = sc.nextInt();
            int n1 = n;
            ArrayList<Integer> a = new ArrayList<>();
            while(n-->0){
                a.add(sc.nextInt());
            }
            Collections.sort(a);
//            for(int i : a){
//                System.out.println(i);
//            }
            long so1 = 0;
            long so2 = 0;
            long sum = 0;
            for(int i = 0; i < n1; i++){
                if(i % 2 == 0){
                    so1 = so1*10+a.get(i);
                } else {
                    so2 = so2*10+a.get(i);
                }
            }
            System.out.println(so1+so2);
        }
    }
}
