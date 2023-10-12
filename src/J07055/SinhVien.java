/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07055;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien> {
    private String ma;
    private String ten;
    private float diem1;
    private float diem2;
    private float diem3;
    private float diemtb;
    private String stt;
    static int cnt = 1;
    

    public SinhVien(String ten, float diem1, float diem2, float diem3) {
        ma = String.format("SV%02d", cnt++);
        this.ten = chuanhoa(ten);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        diemtb = (diem1*25 + diem2*35 + diem3*40)/100;
        if(diemtb >= 8){
            stt= "GIOI";
        } else if(diemtb >= 6.5){
            stt= "KHA";
        } else if(diemtb >= 5){
            stt= "TRUNG BINH";
        } else {
            stt = "KEM";
        }
    }

    
    public String getMa() {
        return ma;
    }

    public float getDiemtb() {
        return diemtb;
    }

    @Override
    public int compareTo(SinhVien o) {
        return Float.compare(o.getDiemtb(), diemtb);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", diemtb) + " " + stt;
    }
    
    private static String chuanhoa(String s){
        String[] a = s.trim().split("\\s+");
        String res = "";
        for(String i : a){
            res += Character.toString(i.charAt(0)).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res;
    }
    
}
