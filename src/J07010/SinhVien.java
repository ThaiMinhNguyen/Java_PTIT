/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07010;

import java.text.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class SinhVien {
    private 
        String msv;
        String ten;
        String lop;
        String dob;
        double diem;
        static int cnt = 1;

    public SinhVien(String ten, String lop, String dob, double diem) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        this.msv =  String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.lop = lop;
        this.dob = date.format(date.parse(dob));
        this.diem = diem;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getDiem() {
        return diem;
    }
    
    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + dob + " " + String.format("%.2f", diem);
    }
    
}
