/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04013;

/**
 *
 * @author admin
 */
public class ThiSinh {
    private String ma;
    private String ten;
    private double diemtoan;
    private double diemly;
    private double diemhoa;
    private double uutien;
    private double tong;
    private String kq;

    public ThiSinh(String ma, String ten, double diemtoan, double diemly, double diemhoa) {
        this.ma = ma;
        this.ten = ten;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
        if(ma.charAt(2) == '1'){
            this.uutien = 0.5;
        } else if (ma.charAt(2) == '2'){
            this.uutien = 1;
        } else {
            this.uutien = 2.5;
        }
        this.tong = this.diemhoa + this.diemly + this.diemtoan*2;
        if(this.tong + this.uutien >= 24){
            kq = "TRUNG TUYEN";
        } else {
            kq = "TRUOT";
        }
    }
    
    private String toS(double t){
        if((int) t == t){
            return "" + (int)t;
        } else {
            return String.format("%.1f", t);
        }
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + toS(uutien) + " " + toS(tong) + " " + kq;
    }
    
    
    
}
