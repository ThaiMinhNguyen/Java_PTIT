/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05031;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop;
    private double d1, d2, d3;

    public SinhVien(String ma, String ten, String lop, double d1, double d2, double d3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public int compareTo(SinhVien o) {
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + d1 + " " + d2 + " " + d3;
    }
    
    
}

