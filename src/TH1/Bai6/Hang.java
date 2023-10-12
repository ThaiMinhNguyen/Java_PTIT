/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai6;

/**
 *
 * @author admin
 */
public class Hang {
    private String ten;
    private String ma;
    private String stt;
    private String gia;
    private int soluong;
    private String giamgia;
    private String thanhtien;

    public Hang(String ten, String ma, String gia, int soluong) {
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.soluong = soluong;
        this.stt = ma.substring(1,4);
        if(ma.charAt(4) == '2'){
            giamgia = Long.toString(30*soluong*Long.parseLong(gia)/100);
            thanhtien = Long.toString(70*soluong*Long.parseLong(gia)/100);
        } else {
            thanhtien = Long.toString(50*soluong*Long.parseLong(gia)/100);
            giamgia = thanhtien;
        }
    }

    @Override
    public String toString() {
        return ten + " " + ma + " " + stt + " " + giamgia + " " + thanhtien;
    }
    
    
    
}
