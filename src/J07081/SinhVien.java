/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07081;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien> {
    private String ma;
    private String fullname;
    private String ten;
    private String ho;
    private String tendem;
    private String sdt;
    private String email;

    public SinhVien(String ma, String fullname, String sdt, String email) {
        this.ma = ma;
        this.fullname = fullname;
        this.sdt = sdt;
        this.email = email;
        String[] s = this.fullname.split("\\s+");
        ten = s[s.length-1];
        ho = s[0];
        tendem = "";
        for(int i = 1; i < s.length-1; i++){
            tendem += s[i] + " ";
        }
    }
    
    public String getTen() {
        return ten;
    }

    public String getHo() {
        return ho;
    }

    public String getTendem() {
        return tendem;
    }

    public String getMa() {
        return ma;
    }
    
    

    @Override
    public String toString() {
        return ma + " " + fullname + " " + sdt + " " + email;
    }
    
    @Override
    public int compareTo(SinhVien o) {
        if(!ten.equals(o.getTen())){
            return ten.compareTo(o.getTen());
        }
        if(!ho.equals(o.getHo())){
            return ho.compareTo(o.getHo());
        }
        if(!tendem.equals(o.getTendem())){
            return tendem.compareTo(o.getTendem());
        }
        return ma.compareTo(o.getMa());
    }
    
}
