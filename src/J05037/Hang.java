/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05037;

/**
 *
 * @author admin
 */
public class Hang implements Comparable<Hang>{
    private String ma, ten, donvi;
    private long dongianhap, phivanchuyen, soluong, thanhtien, giaban;
    static int cnt = 1;

    public Hang(String ten, String donvi, long dongianhap, long soluong) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.donvi = donvi;
        this.dongianhap = dongianhap;
        this.soluong = soluong;
        this.phivanchuyen = Math.round((double)soluong*dongianhap*5/100);
        this.thanhtien = Math.round(dongianhap*soluong + phivanchuyen);
        this.giaban = (long) Math.ceil((double)((thanhtien + Math.round((double) (thanhtien * 2) / 100 )) / soluong ) / 100 ) * 100 ;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + phivanchuyen + " " + thanhtien + " " + giaban;
    }

    @Override
    public int compareTo(Hang o) {
        return -Long.compare(giaban, o.giaban);
    }
    
    
}
