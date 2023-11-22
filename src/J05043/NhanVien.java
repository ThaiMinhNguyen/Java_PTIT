/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05043;

/**
 *
 * @author admin
 */
import java.lang.*;

public class NhanVien {
    private String ma, ten;
    private int songaycong;
    private long luongngay, luongthang, tamung, phucap;
    static int cnt = 1;

    public NhanVien(String ten, String chucvu, long luongngay, int songaycong) {
        ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.songaycong = songaycong;
        this.luongngay = luongngay;
        if(chucvu.equals("GD")){
            phucap = 500;
        }
        else if(chucvu.equals("PGD")){
            phucap = 400;
        }
        else if(chucvu.equals("TP")){
            phucap = 300;
        }
        else if(chucvu.equals("KT")){
            phucap = 250;
        } else {
            phucap = 100;
        }
        luongthang = luongngay * songaycong;
        if((phucap + luongthang) * 2 / 3 < 25000){
            tamung =  Math.round((double)(phucap + luongthang) * 2 / 3 / 1000) * 1000;
        } else {
            tamung = 25000;
        }
    }


    @Override
    public String toString() {
        return ma + " " + ten + " " + phucap + " " + luongthang + " " + tamung + " " + (luongthang + phucap - tamung);
    }
    
    
}