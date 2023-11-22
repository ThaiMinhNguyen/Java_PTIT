/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT.B4;

/**
 *
 * @author admin
 */
import java.text.*;
import java.util.*;

public class CaThi implements Comparable<CaThi>{
    private String ma, id, nhom, sosv;
    private Date ngay, gio;
    private MonHoc a;
    static int cnt = 1;

    public CaThi(String ngay, String gio, String id) throws ParseException {
        this.ma = String.format("C%03d", cnt++);
        SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat d2 = new SimpleDateFormat("HH:mm");
        this.ngay = d1.parse(ngay);
        this.gio = d2.parse(gio);
        this.id = id;
    }

    public void setA(MonHoc a) {
        this.a = a;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public void setSosv(String sosv) {
        this.sosv = sosv;
    }
    

    public String getMa() {
        return ma;
    }

    public String getId() {
        return id;
    }

    public Date getNgay() {
        return ngay;
    }

    public Date getGio() {
        return gio;
    }
    
    @Override
    public int compareTo(CaThi o) {
        if(!ngay.equals(o.ngay)){
            return ngay.compareTo(o.ngay);
        }
        if(!gio.equals(o.gio)){
            return gio.compareTo(o.gio);
        }
        return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat d2 = new SimpleDateFormat("HH:mm");
        return d1.format(ngay) + " " + d2.format(gio) + " " + id + " " + a + " " + nhom + " " + sosv;
    }
    
    
}
