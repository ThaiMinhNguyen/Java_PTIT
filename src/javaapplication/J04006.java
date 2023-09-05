/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J04006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        String ngaysinh = sv.getDob();
        String[] s = ngaysinh.split("/");
        String ngaysinh_chuanhoa = "";
        for(int i = 0; i < s.length; i++){
            if(s[i].length() == 1) {
                ngaysinh_chuanhoa = ngaysinh_chuanhoa + "0" + s[i] + "/";
            } else {
                ngaysinh_chuanhoa = ngaysinh_chuanhoa + s[i] + "/";
            }
        }
        sv.setDob(ngaysinh_chuanhoa.substring(0, ngaysinh_chuanhoa.length()-1));
        System.out.printf("%s %s %s %s %.2f",sv.getMsv(),sv.getTen() ,sv.getLop() , sv.getDob() , sv.getDiem());
    }
}


class SinhVien {
    private 
        String msv = "B20DCCN001";
        String ten;
        String lop;
        String dob;
        double diem;

    public SinhVien(String ten, String lop, String dob, double diem) {
        this.ten = ten;
        this.lop = lop;
        this.dob = dob;
        this.diem = diem;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    
}

