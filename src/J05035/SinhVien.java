/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05035;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private int stt;
    private String msv, ten, lop, email, doanhnghiep;
    static int cnt = 1;

    public SinhVien(String msv, String ten, String lop, String email, String doanhnghiep) {
        this.stt = cnt++;
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanhnghiep = doanhnghiep;
    }

    public String getDoanhnghiep() {
        return doanhnghiep;
    }

    @Override
    public int compareTo(SinhVien o) {
        return msv.compareTo(o.msv);
    }

    @Override
    public String toString() {
        return stt + " " + msv + " " + ten + " " + lop + " " + email + " " + doanhnghiep;
    }
    
    
}
