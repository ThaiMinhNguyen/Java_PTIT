/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai8;

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
    private String gv;
    private String detai;

    public SinhVien(String msv, String ten, String lop, String email, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = '0' + sdt;
    }

    public String getMsv() {
        return msv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    public void setDetai(String detai) {
        this.detai = detai;
    }
    
    

    @Override
    public String toString() {
        return msv + " " + ten + " " + gv + " " + detai + " " + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        return msv.compareTo(o.msv);
    }
       
}
