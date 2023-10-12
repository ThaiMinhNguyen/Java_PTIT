/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07033;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien> {
    private String msv;
    private String ten;
    private String tenlop;
    private String email;

    public SinhVien(String msv, String ten, String tenlop, String email) {
        this.msv = msv;
        this.ten = chuanhoa(ten);
        this.tenlop = tenlop;
        this.email = email;
    }

    public String getMsv() {
        return msv;
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
    public int compareTo(SinhVien o) {
        return this.msv.compareTo(o.getMsv());
    }

    @Override
    public String toString() {
        return  msv + " " + ten + " " + tenlop + " " + email;
    }
    
    
}
