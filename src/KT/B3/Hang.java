/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT.B3;

/**
 *
 * @author admin
 */
public class Hang implements Comparable<Hang>{
    private String ma, ten;
    private int gia, baohanh;

    public Hang(String ma, String ten, int gia, int baohanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baohanh = baohanh;
    }

    @Override
    public int compareTo(Hang o) {
        if(gia != o.gia){
            return o.gia - gia;
        }
        return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + baohanh;
    }
    
    
}
