/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054;

/**
 *
 * @author admin
 */
public class HocSinh implements Comparable<HocSinh>{
    private String ma, ten, xeploai;
    private double diem;
    private int stt;
    static int cnt = 1;

    public HocSinh(String ten, double diem) {
        this.ma = String.format("HS%02d", cnt++);
        this.ten = ten;
        this.diem = diem;
        if(diem < 5){
            xeploai = "Yeu";
        } else if (diem < 7){
            xeploai = "Trung Binh";
        } else if (diem < 9){
            xeploai = "Kha";
        } else {
            xeploai = "Gioi";
        }     
    }

    public double getDiem() {
        return diem;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }

    public String getMa() {
        return ma;
    }
    
    
    @Override
    public int compareTo(HocSinh o) {
        return -Double.compare(diem, o.diem);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.1f", diem) + " " + xeploai + " " + stt;
    }
    
    
}
