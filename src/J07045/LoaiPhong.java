/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07045;

/**
 *
 * @author admin
 */
public class LoaiPhong implements Comparable<LoaiPhong> {
    private String kyhieu;
    private String ten;
    private String dongia;
    private String phi;

    public LoaiPhong(String s) {
        String[] k = s.split("\\s+");
        this.kyhieu = k[0];
        this.ten = k[1];
        this.dongia = k[2];
        this.phi = k[3];
    }

    public String getTen() {
        return ten;
    }

    
    @Override
    public String toString() {
        return kyhieu + " " + ten + " " + dongia + " " + phi;
    }
    

    @Override
    public int compareTo(LoaiPhong o) {
        return ten.compareTo(o.getTen());
    }
    
    
}
