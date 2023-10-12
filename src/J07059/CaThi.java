/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07059;

/**
 *
 * @author admin
 */
public class CaThi implements Comparable<CaThi> {
    private String ma;
    private String ngay;
    private String gio;
    private String id;
    static int cnt = 1;

    public CaThi(String ngay, String gio, String id) {
        ma = String.format("C%03d", cnt++);
        this.ngay = ngay;
        this.gio = gio;
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public String getNgay() {
        return ngay;
    }

    public String getGio() {
        return gio;
    }

    @Override
    public String toString() {
        return ma + " " + ngay + " " + gio + " " + id;
    }
    
    
    
    @Override
    public int compareTo(CaThi o) {
        if(!ngay.equals(o.getNgay())){
            return ngay.compareTo(o.getNgay());
        }
        if(!gio.equals(o.getGio())){
            return gio.compareTo(o.getGio());
        }
        return ma.compareTo(o.getMa());
    }
    
    
    
}
