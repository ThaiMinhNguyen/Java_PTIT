/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05055;

/**
 *
 * @author admin
 */
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten, uutien, ut, tt;
    private String ngaysinh, batdau, ketthuc;
    private int stt;
    static int cnt = 1;

    public ThiSinh(String ten, String ngaysinh, String batdau, String ketthuc) {
        this.ma = String.format("VDV%02d", cnt++);
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        String[] k = ngaysinh.split("/");
        int tuoi = 2021 - Integer.valueOf(k[2]);
        int s = 0;
        if(tuoi >= 32){
            s = 3;
        } else if (tuoi >= 25){
            s = 2;
        } else if (tuoi >= 18){
            s = 1;
        }
        String[] m1 = batdau.split(":");
        String[] m2 = ketthuc.split(":");
        int thanhtich = (Integer.valueOf(m2[0]) * 3600 + Integer.valueOf(m2[1]) * 60 + Integer.valueOf(m2[2])) - (Integer.valueOf(m1[0]) * 3600 + Integer.valueOf(m1[1]) * 60 + Integer.valueOf(m1[2]));
        tt = doi(thanhtich);
        ut = doi(thanhtich - s);
        this.uutien = String.format("00:00:%02d", s);
        this.batdau = batdau;
        this.ketthuc = ketthuc;
//        stt = 1;
    }
    
    private static String doi(int thanhtich){
        int gio = (int)(thanhtich / 3600);
        int phut = (int)((thanhtich - gio * 3600) / 60);
        int giay = thanhtich - gio * 3600 - phut * 60;
        return String.format("%02d:%02d:%02d", gio, phut, giay);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tt + " " + uutien + " " + ut + " " + stt;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getUt() {
        return ut;
    }

    @Override
    public int compareTo(ThiSinh o) {
        return ut.compareTo(o.ut);
    }

    public String getMa() {
        return ma;
    }
    
    
}
//public class ThiSinh {
//    private String ma, ten, uutien;
//    private Date ngaysinh;
//    private LocalTime batdau, ketthuc, tt, ut;
//    static int cnt = 1;
//
//    public ThiSinh(String ten, String ngaysinh, String batdau, String ketthuc) {
//        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
//        TimeFo
//        this.ma = String.format("VDV%02d", cnt++);
//        this.ten = ten;
//        this.ngaysinh = ngaysinh;
//        String[] k = ngaysinh.split("/");
//        int tuoi = 2023 - Integer.valueOf(k[2]);
//        int s = 0;
//        if(tuoi >= 32){
//            s = 3;
//        } else if (tuoi >= 25){
//            s = 2;
//        } else if (tuoi >= 18){
//            s = 1;
//        }
//        
//        this.uutien = String.format("00:00:%02d", s);
//        this.batdau = batdau;
//        this.ketthuc = ketthuc;
//    }
//    
//}
