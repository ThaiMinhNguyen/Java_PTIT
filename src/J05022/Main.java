/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05022;

/**
 *
 * @author admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while(t-->0){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
//        Collections.sort(a);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String ma = sc.nextLine();
            System.out.println(String.format("DANH SACH SINH VIEN LOP %s:", ma));
            for(SinhVien i : a){
                if(i.getLop().equals(ma)){
                    System.out.println(i);
                }
            }
        }
       
    }
}