/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author admin
 */
public class KhachHang implements Comparable<KhachHang> {
    private String ma;
    private String ten;
    private String diachi;
    private String masp;
    private int soluong;
    private LocalDate ngaymua;
    private LocalDate ngayhethan;
    private int tong;
    static int cnt = 1;

    public KhachHang(String ten, String diachi, String masp, int soluong, String ngaymua) throws ParseException {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.diachi = diachi;
        this.masp = masp;
        this.soluong = soluong;
        this.ngaymua = LocalDate.parse(ngaymua, date);
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    

    public String getMasp() {
        return masp;
    }

    public LocalDate getNgaymua() {
        return ngaymua;
    }

    public void setNgayhethan(LocalDate ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diachi + " " + masp + " " + tong + " " + ngayhethan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public int compareTo(KhachHang o) {
        if(!ngayhethan.equals(o.ngayhethan)){
            return ngayhethan.compareTo(o.ngayhethan);
        }
        return ma.compareTo(o.ma);
    }

    
    
}


