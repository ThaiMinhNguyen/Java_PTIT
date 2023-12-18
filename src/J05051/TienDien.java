/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05051;

/**
 *
 * @author admin
 */
public class TienDien implements Comparable<TienDien>{
    private String ma;
    private long heso, thanhtien, phutroi, tong;
    static int cnt = 1;

    public TienDien(String loai, long socu, long somoi) {
        this.ma = String.format("KH%02d", cnt++);
        if(loai.equals("KD")){
            heso = 3;
        } else if(loai.equals("NN")){
            heso = 5;
        } else if(loai.equals("TT")){
            heso = 4;
        } else if(loai.equals("CN")){
            heso = 2;
        }
        thanhtien = (long) ((somoi - socu) * heso * 550);
        if((somoi - socu) < 50){
            phutroi = 0;
        } else if ((somoi - socu) >= 50 && (somoi - socu) <= 100){
            phutroi = Math.round((float)(thanhtien * 0.35));
        } else if ((somoi - socu) > 100){
            phutroi =  thanhtien;
        }
        tong = phutroi + thanhtien;
    }

    @Override
    public String toString() {
        return ma + " " + heso + " " + thanhtien + " " + phutroi + " " + tong;
    }

    @Override
    public int compareTo(TienDien o) {
        return -Long.compare(tong, o.tong);
    }
    
    
}
