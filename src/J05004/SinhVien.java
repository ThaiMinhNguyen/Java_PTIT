/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05004;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String msv;
    private String ten;
    private String lop;
    private String ngaysinh;
    private double diem;
    static int cnt = 1;

    public SinhVien() {
    }
    
    
    
    public SinhVien(String ten, String lop, String ngaysinh, double diem) {
        this.msv = String.format("B20DCCN%03d", cnt++);
        this.ten = chuanhoa(ten);
        this.lop = lop;
        String dob = "";
        String [] ns = ngaysinh.split("/");
        if(ns[0].length() < 2){
            dob += '0' + ns[0] + '/';
        } else {
            dob += ns[0]+'/';
        }
        if(ns[1].length() < 2){
            dob += '0' + ns[1] + '/';
        } else {
            dob += ns[1]+'/';
        } 
        dob += ns[2];
        this.ngaysinh = dob;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return  msv + " " + ten + " " + lop + " " + ngaysinh + " " + String.format("%.2f",diem);
    }
    
    private static String chuanhoa(String s){
        String[] a = s.trim().split("\\s+");
        String res = "";
        for(String i : a){
            res += Character.toString(i.charAt(0)).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res;
    }
}

