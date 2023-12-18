/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05053;

/**
 *
 * @author admin
 */
public class Hang implements Comparable<Hang>{
    private String ten, ma, stt;
    private long gia, soluong, giamgia, tong;

    public Hang(String ten, String ma, long gia, long soluong) {
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.soluong = soluong;
        this.stt = ma.substring(1, 4);
        if (ma.charAt(4) == '1'){
            giamgia = gia * soluong * 5 / 10;
        } else {
            giamgia = gia * soluong * 3 / 10;
        }
        tong = soluong * gia - giamgia;
    }

    @Override
    public String toString() {
        return ten + " " + ma + " " + stt + " " + giamgia + " " + tong;
    }

    @Override
    public int compareTo(Hang o) {
        return stt.compareTo(o.stt);
    }
    
}
