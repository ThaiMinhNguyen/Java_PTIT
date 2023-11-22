/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05027;

/**
 *
 * @author admin
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> a = new ArrayList<>();
        while(t-->0){
            a.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String ten = sc.nextLine();
            System.out.println(String.format("DANH SACH GIANG VIEN THEO TU KHOA %s:", ten));
            for(GiangVien i : a){
                if(i.getTen().toLowerCase().contains(ten.toLowerCase())){
                    System.out.println(i);
                }
            }
        }
        
    }
    
}
