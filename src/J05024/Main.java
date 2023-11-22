/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05024;

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
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String ma = sc.nextLine();
            String ma_vt = "";
            if(ma.equals("Ke toan")){
                ma_vt = "DCKT";
            } else if (ma.equals("Cong nghe thong tin")){
                ma_vt = "DCCN";
            } else if (ma.equals("An toan thong tin")){
                ma_vt = "DCAT";
            } else if (ma.equals("Vien thong")){
                ma_vt = "DCVT";
            } else if (ma.equals("Dien tu")){
                ma_vt = "DCDT";
            } 
            System.out.println(String.format("DANH SACH SINH VIEN NGANH %s:", ma.toUpperCase()));
            for(SinhVien i : a){
                if(ma_vt.equals("DCCN")|| ma_vt.equals("DCAT")){
                    if(i.getMsv().substring(3, 7).equals(ma_vt) && i.getLop().charAt(0) != 'E'){
                        System.out.println(i);
                    }
                }
                else if(i.getMsv().substring(3, 7).equals(ma_vt)){
                    System.out.println(i);
                }
            }
        }
       
    }
}