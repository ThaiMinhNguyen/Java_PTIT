/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05049;

/**
 *
 * @author admin
 */
import java.lang.*;

public class Hang implements Comparable<Hang>{
    private String ma;
    private long soluongnhap, soluongxuat, dongia, tien, thue;

    public Hang(String ma, long soluongnhap) {
        this.ma = ma;
        this.soluongnhap = soluongnhap;
        
        if(ma.startsWith("A")){
            soluongxuat = (long) Math.round(soluongnhap * 0.6);
        } else if (ma.startsWith("B")) {
            soluongxuat = (long) Math.round(soluongnhap * 0.7);
        }
        if(ma.endsWith("Y")){
            dongia = 110000;
        } else if (ma.endsWith("N")) {
            dongia = 135000;
        }
        tien = soluongxuat*dongia;
        if(ma.startsWith("A")){
            if(ma.endsWith("Y")){
                thue = (long) (tien * 0.08);
            } else {
                thue = (long) (tien * 0.11);
            }
        } else {
            if(ma.endsWith("Y")){
                thue = (long) (tien * 0.17);
            } else {
                thue = (long) (tien * 0.22);
            }
        }
        
    }

    public String getMa() {
        return ma;
    }
    

    @Override
    public String toString() {
        return ma + " " + soluongnhap + " " + soluongxuat + " " + dongia + " " + tien + " " + thue;
    }

    @Override
    public int compareTo(Hang o) {
        return Long.compare(o.thue, thue);
    }
    
    
}
