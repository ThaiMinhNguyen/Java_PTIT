/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai10;

/**
 *
 * @author admin
 */
public class GiangVien {
    private String ma;
    private String ten;
    private double gio;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public double getGio() {
        return gio;
    }

    public String getMa() {
        return ma;
    }
    
    
    
    public void setGio(double gio) {
        this.gio = gio;
    }

    @Override
    public String toString() {
        return ten + " " + String.format("%.2f", gio);
    }
    
    
}
