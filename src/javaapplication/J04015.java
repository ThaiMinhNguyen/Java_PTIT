/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J04015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String t = sc.nextLine();
        GiaoVien gv = new GiaoVien(x.substring(0,2), x.substring(2), t ,new BigInteger(sc.nextLine()));
        gv.tinhtong();
        System.out.println(gv.toString());
    }
}

class GiaoVien {
    private
            String ma, heso, ten, phucap;
            BigInteger luong, tong;

    public GiaoVien(String ma, String heso, String ten, BigInteger luong) {
        this.ma = ma;
        this.heso = heso;
        this.ten = ten;
        this.luong = luong;
        this.tong = tong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHeso() {
        return heso;
    }

    public void setHeso(String heso) {
        this.heso = heso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public BigInteger getLuong() {
        return luong;
    }

    public void setLuong(BigInteger luong) {
        this.luong = luong;
    }

    public BigInteger getTong() {
        return tong;
    }

    public void setTong(BigInteger tong) {
        this.tong = tong;
    }

    public String getPhucap() {
        return phucap;
    }
    
    public void tinhtong(){
        BigInteger s = this.luong.multiply(new BigInteger(this.heso));
//        System.out.println(s);
        if(this.ma.equals("HT") == true) {
            this.phucap = "2000000";
            s = s.add(new BigInteger("2000000"));
        } else if(this.ma.equals("HP") == true) {
            this.phucap = "900000";
            s = s.add(new BigInteger("900000"));
        } else {
            s = s.add(new BigInteger("500000"));
            this.phucap = "500000";
        }
        this.tong = s;
    }

    @Override
    public String toString() {
        return ma + heso + " " + ten + " " + Integer.parseInt(heso) + " " + phucap + " " + tong;
    }
    
    
}