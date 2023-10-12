/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai14;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien> {
    private String maSv;
    private String ten;
    private String sdt;
    private String email;
    private DeTai detai;

    public SinhVien(String maSv, String ten, String sdt, String email) {
        this.maSv = maSv;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setDetai(DeTai detai) {
        this.detai = detai;
    }

    public DeTai getDetai() {
        return detai;
    }

    
    @Override
    public int compareTo(SinhVien o) {
        return detai.getTenDetai().compareTo(o.getDetai().getTenDetai());
    }

    @Override
    public String toString() {
        return maSv + " " + ten + " " + sdt + " " + email + " " + detai;
    }
    
    
    
}
