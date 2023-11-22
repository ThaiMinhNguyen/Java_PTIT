/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05020;

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
    
    

    @Override
    public int compareTo(SinhVien o) {
        if(!lop.equals(o.lop)){
            return lop.compareTo(o.lop);
        }
        return msv.compareTo(o.msv);
    }
    
    
}
