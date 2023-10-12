/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07034;

/**
 *
 * @author admin
 */
public class MonHoc implements Comparable<MonHoc> {
    private String ma;
    private String ten;
    private int tinchi;

    public MonHoc(String ma, String ten, int tinchi) {
        this.ma = ma;
        this.ten = ten;
        this.tinchi = tinchi;
    }

    public String getTen() {
        return ten;
    }
    

    @Override
    public int compareTo(MonHoc o) {
        return ten.compareTo(o.getTen());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tinchi;
    }
    
    
}
