/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07054;

/**
 *
 * @author admin
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while(t-->0){
            a.add(new SinhVien(sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(a);
        int s = 1;
        int k = 0;
        float d = 0;
        for(SinhVien i : a){
            d = Float.max(d, i.getDiemtb());
//            System.out.println(d);
            if(d == i.getDiemtb()){
                i.setStt(s);
                k++;
            } else {
                if(k == 0){
                    s++;
                }
                s+=k;       
                k = 0;
                i.setStt(s);
            }
            System.out.println(i);
        }
    }
}
