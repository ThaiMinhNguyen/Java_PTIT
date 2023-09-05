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
public class J04007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        nv.setMnv("00001");
        System.out.println(nv.toString());
    }
}


class NhanVien {
    private
            String mnv, ten, gioitinh, ngaysinh, diachi, masothue, ngayki;

    public NhanVien(String ten, String gioitinh, String ngaysinh, String diachi, String masothue, String ngayki) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngayki = ngayki;
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMasothue() {
        return masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    public String getNgayki() {
        return ngayki;
    }

    public void setNgayki(String ngayki) {
        this.ngayki = ngayki;
    }

    @Override
    public String toString() {
        return mnv + " " + ten + " " + gioitinh + " " + ngaysinh + " " + diachi + " " + masothue + " " + ngayki ;
    }
    
    
}

