/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07048;

/**
 *
 * @author admin
 */
public class SanPham implements Comparable<SanPham> {
    private String ma;
    private String ten;
    private int giaban;
    private String thoihan;

    public SanPham(String ma, String ten, int giaban, String thoihan) {
        this.ma = ma;
        this.ten = ten;
        this.giaban = giaban;
        this.thoihan = thoihan;
    }

    public String getMa() {
        return ma;
    }

    public int getGiaban() {
        return giaban;
    }
    
    
        
    @Override
    public String toString() {
        return ma + " " + ten + " " + giaban + " " + thoihan;
    }

    @Override
    public int compareTo(SanPham o) {
        if(giaban != o.getGiaban()){
            return -(giaban - o.getGiaban());
        }
        return ma.compareTo(o.getMa());
    }
    
    
}
