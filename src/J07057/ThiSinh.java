/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057;

/**
 *
 * @author admin
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String ma;
    private String ten;
    private float diemthi;
    private String dantoc;
    private float khuvuc;
//    private float diemtong;
    private String status;
    static int cnt = 1;

    public ThiSinh(String ten, float diemthi, String dantoc, float khuvuc) {
        ma = String.format("TS%02d", cnt++);
        this.ten = chuanhoa(ten);
        this.diemthi = diemthi;
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
        if(!dantoc.equals("Kinh")){
            this.diemthi += 1.5;
        }
        if(khuvuc == 1){
            this.diemthi += 1.5;
        } else if (khuvuc == 2){
            this.diemthi += 1;
        }
        if (this.diemthi >= 20.5){
            status = "Do";
        } else {
            status = "Truot";
        }
        
    }

    public float getDiemtong() {
        return this.diemthi;
    }

    public String getMa() {
        return ma;
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
    public String toString() {
        return ma + " " + ten + " " + String.format("%.1f",this.diemthi) + " " + status;
    }

    
    
    @Override
    public int compareTo(ThiSinh o) {
        if(this.diemthi != o.getDiemtong()){
            return - Float.compare(this.diemthi,  o.getDiemtong());
        }
        return ma.compareTo(o.getMa());
    }
}
