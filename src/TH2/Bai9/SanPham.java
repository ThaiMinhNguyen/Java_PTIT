/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai9;

/**
 *
 * @author admin
 */
public class SanPham {
    private String masp;
    private String ten;
    private int giaban;
    private int baohanh;

    public SanPham(String masp, String ten, int giaban, int baohanh) {
        this.masp = masp;
        this.ten = ten;
        this.giaban = giaban;
        this.baohanh = baohanh;
    }

    public String getMasp() {
        return masp;
    }

    public int getBaohanh() {
        return baohanh;
    }

    public int getGiaban() {
        return giaban;
    }
    
    
}
