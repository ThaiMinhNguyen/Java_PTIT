/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05023;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private String msv;
    private String ten;
    private String lop;
    private String email;

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email;
    }

    public String getMsv() {
        return msv;
    }

    public String getLop() {
        return lop;
    }

    

    @Override
    public int compareTo(SinhVien o) {
        return msv.compareTo(o.msv);
    }
    
}