/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_tren_lop.Bai6;

/**
 *
 * @author admin
 */
public class MonHoc implements Comparable<MonHoc> {
    private String ma;
    private String ten;
    private String hinhthuc;

    public MonHoc(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public int compareTo(MonHoc o) {
        return ma.compareTo(o.getMa());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhthuc;
    }
    
}
