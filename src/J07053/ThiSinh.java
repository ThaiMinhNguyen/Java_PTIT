/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07053;

/**
 *
 * @author admin
 */
import java.time.*;

public class ThiSinh {
    private String ma;
    private String ten;
    private int tuoi;
    private double lythuyet;
    private double thuchanh;
    private int diem;
    private String status;
    static int cnt = 1;
    

    public ThiSinh(String ten, String ngaysinh, double lythuyet, double thuchanh) {
        ma = String.format("PH%02d", cnt++);
        this.ten = chuanhoa(ten);
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
        tuoi = 2021 - Integer.parseInt(ngaysinh.substring(ngaysinh.length()- 4));
        
        
        if (lythuyet >= 8 && thuchanh >= 8){
            diem = (int) Math.round((lythuyet + thuchanh)/2 + 1);
        } else if (lythuyet >= 7.5 && thuchanh >= 7.5){
            diem = (int) Math.round((lythuyet + thuchanh)/2 + 0.5);
        } else {
            diem = (int) Math.round((lythuyet + thuchanh)/2);
        }
        if(diem > 10) diem = 10;
        if(diem < 5){
            status = "Truot";
        } else if(diem <= 6){
            status = "Trung binh";
        } else if(diem == 7){
            status = "Kha";
        } else if(diem == 8){
            status = "Gioi";
        } else {
            status = "Xuat sac";
        }
    }
    
    private static String chuanhoa(String s){
        String res = "";
        String[] a = s.trim().toLowerCase().split("\\s++");
        for(String i : a){
            res += Character.toString(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        }
        return res.trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tuoi + " " + diem + " " + status;
    }
    
    
}
