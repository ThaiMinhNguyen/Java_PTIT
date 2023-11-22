/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05040;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String ma, ten;
    private int songaycong;
    private long luongngay, luongthang, thuong, phucap;
    private long tong;
    static int cnt = 1;

    public NhanVien(String ten, long luongngay, int songaycong, String chucvu) {
        ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.songaycong = songaycong;
        this.luongngay = luongngay;
        if(chucvu.equals("GD")){
            phucap = 250000;
        }
        if(chucvu.equals("PGD")){
            phucap = 200000;
        }
        if(chucvu.equals("TP")){
            phucap = 180000;
        }
        if(chucvu.equals("NV")){
            phucap = 150000;
        }
        luongthang = luongngay * songaycong;
        if(songaycong >= 25){
            thuong = luongthang*20/100;
        } else if (songaycong >= 22){
            thuong = luongthang*10/100;
        } 
        tong = luongthang + thuong + phucap;
    }

    public long getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luongthang + " " + thuong + " " + phucap + " " + tong;
    }
    
    
}