/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07073;

/**
 *
 * @author admin
 */
public class MonHoc implements Comparable<MonHoc> {
    private String ma;
    private String ten;
    private int tinchi;
    private String lythuyet;
    private String thuchanh;

    public MonHoc(String ma, String ten, int tinchi, String lythuyet, String thuchanh) {
        this.ma = ma;
        this.ten = ten;
        this.tinchi = tinchi;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }

    public String getThuchanh() {
        return thuchanh;
    }
    
    

    @Override
    public String toString() {
        return ma + " " + ten + " " + tinchi + " " + lythuyet + " " + thuchanh;
    }

    @Override
    public int compareTo(MonHoc o) {
        return ma.compareTo(o.ma);
    }
    
    
}
