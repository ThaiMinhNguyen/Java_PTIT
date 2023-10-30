/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai7;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private String msv;
    private String ten;
    private String lop;
    private String email;
    private String sdt;

    public SinhVien(String msv, String ten, String lop, String email, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = '0' + sdt;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email + " " + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(!lop.equals(o.lop)){
            return lop.compareTo(o.lop);
        }
        return msv.compareTo(o.msv);
    }
    
    
    
}
