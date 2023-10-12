/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07052;

/**
 *
 * @author admin
 */
import java.text.*;

public class ThiSinh implements Comparable<ThiSinh> {
    private String ma;
    private String ten;
    private double diemtoan;
    private double diemly;
    private double diemhoa;
    private double diemuutien;
    private double diem;

    public ThiSinh(String ma, String ten, double diemtoan, double diemly, double diemhoa) {
        this.ma = ma;
        this.ten = chuanhoa(ten);
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
        if(ma.charAt(2) == '1'){
            diemuutien = 0.5;
            diem = diemhoa + diemly + diemtoan*2 + diemuutien;
        }
        if(ma.charAt(2) == '2'){
            diemuutien = 1;
            diem = diemhoa + diemly + diemtoan*2 + diemuutien;
        }
        if(ma.charAt(2) == '3'){
            diemuutien = 2.5;
            diem = diemhoa + diemly + diemtoan*2 + diemuutien;
        }
    }

    public String getMa() {
        return ma;
    }

    public double getDiem() {
        return diem;
    }
    
    
    
    private static String chuanhoa(String s){
        String res = "";
        String[] a = s.trim().toLowerCase().split("\\s++");
        for(String i : a){
            res += Character.toString(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        }
        return res.trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + (new DecimalFormat().format(diemuutien)) + " " + (new DecimalFormat().format(diem));
    }
    
    

    @Override
    public int compareTo(ThiSinh o) {
        if(diem != o.getDiem()){
            return -Double.compare(diem, o.getDiem()) ;
        } else {
            return ma.compareTo(o.getMa());
        }
    }
    
    
}
