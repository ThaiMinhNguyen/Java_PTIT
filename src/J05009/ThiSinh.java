/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

/**
 *
 * @author admin
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private int ma;
    private String ten;
    private String ngaysinh;
    private double tong;

    public ThiSinh(int ma, String ten, String ngaysinh, double d1, double d2, double d3) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.tong = d1 + d2 + d3;
    }

    public double getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ngaysinh + " " + tong;
    }
    
    
    
    @Override
    public int compareTo(ThiSinh o) {
        if(tong != o.tong){
            return Double.compare(o.tong,tong);
        } 
        return ma - o.ma;
    }
    
    
}
