/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05046;

import java.util.*;

/**
 *
 * @author admin
 */
public class Hang {
    private String ma, ten;
    private long soluong, dongia, chietkhau;
    static Map<String, Integer> cnt = new HashMap<>();

    public Hang(String ten, long soluong, long dongia) {
        String[] k = ten.split("\\s++");
        String ma = k[0].substring(0, 1).toUpperCase() + k[1].substring(0, 1).toUpperCase();
        int c;
        if (!cnt.containsKey(ma)){
            c = 1;
            cnt.put(ma, 1);
        } else {
            c = cnt.get(ma) + 1;
            cnt.put(ma, c);
        }
        this.ma = String.format(ma + "%02d", c);
        this.ten = ten;
        this.soluong = soluong;
        this.dongia = dongia;
        if(soluong > 10){
            chietkhau = soluong*dongia*5/100;
        } else if (soluong >= 8){
            chietkhau = soluong*dongia*2/100;
        } else if (soluong >= 5){
            chietkhau = soluong*dongia*1/100;
        } else {
            chietkhau = 0;
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + chietkhau + " " + (soluong*dongia - chietkhau);
    }   
    
    
}
