/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05023;

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
            System.out.println(String.format("DANH SACH SINH VIEN KHOA %s:", ma));
            for(SinhVien i : a){
                if(i.getLop().substring(1, 3).equals(ma.substring(2))){
                    System.out.println(i);
                }
            }
        }
       
    }
}