/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07050;

/**
 *
 * @author admin
 */
public class Hang implements Comparable<Hang> {
    private String ma;
    private String ten;
    private String nhom;
    private float mua;
    private float ban;
    private float loi;
    static int cnt = 1;

    public Hang(String ten, String nhom, float mua, float ban) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.loi = ban - mua;
    }

    public float getLoi() {
        return loi;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loi);
    }
    

    @Override
    public int compareTo(Hang o) {
        return -Float.compare(loi, o.getLoi());
    }
    
    
}
