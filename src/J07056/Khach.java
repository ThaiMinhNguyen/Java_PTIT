/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07056;

/**
 *
 * @author admin
 */
public class Khach implements Comparable<Khach> {
    private String ma;
    private String ten;
    private String loai;
    private int sodien;
    private int tientrong;
    private int tienvuot;
    private int tong;
    static int cnt = 1;
    

    public Khach(String ten, String s) {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = chuanhoa(ten);
        String[] k = s.split("\\s+");
        this.loai = k[0];
        this.sodien = Integer.parseInt(k[2]) - Integer.parseInt(k[1]);
        if(loai.equals("A")){
            if(sodien > 100){
                tientrong = 100*450;
                tienvuot = (sodien - 100)*1000;
                tong = tientrong + tienvuot*105/100;
            } else {
                tientrong = sodien*450;
                tienvuot = 0;
                tong = tientrong;
            }
        }
        if(loai.equals("B")){
            if(sodien > 500){
                tientrong = 500*450;
                tienvuot = (sodien - 500)*1000;
                tong = tientrong + tienvuot*105/100;
            } else {
                tientrong = sodien*450;
                tienvuot = 0;
                tong = tientrong;
            }
        }
        if (loai.equals("C")){
            if(sodien > 200){
                tientrong = 200*450;
                tienvuot = (sodien - 200)*1000;
                tong = tientrong + tienvuot*105/100;
            } else {
                tientrong = sodien*450;
                tienvuot = 0;
                tong = tientrong;
            }
        }
    }

    public int getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tientrong + " " + tienvuot + " " + (int)tienvuot*5/100 + " " + tong;
    }
    
    
    
    private static String chuanhoa(String s){
        String[] a = s.trim().split("\\s+");
        String res = "";
        for(String i : a){
            res += Character.toString(i.charAt(0)).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res;
    }

    @Override
    public int compareTo(Khach o) {
        return o.getTong() - tong;
    }
    
}
