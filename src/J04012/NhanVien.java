/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04012;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String ma;
    private String name;
    private int luong;
    private int thuong;
    private int phucap;
    private int thunhap;
    private int ngaycong;
    private String chucvu;
    static int cnt = 1;

    public NhanVien(String name, int luong, int ngaycong, String chucvu) {
        this.ma = String.format("NV%02d", cnt++);
        this.name = name;
        this.luong = luong;
        this.ngaycong = ngaycong;
        this.chucvu = chucvu;
        if(chucvu.equals("GD")){
           this.phucap = 250000;
        } else if (chucvu.equals("PGD")){
           this.phucap = 200000;
        } else if (chucvu.equals("TP")){
           this.phucap = 180000;
        } else if (chucvu.equals("NV")){
           this.phucap = 150000;
        }
        if(ngaycong >= 25){
            thuong = this.luong*this.ngaycong * 20/100;
        } else if (ngaycong >= 22){
            thuong = this.luong*this.ngaycong * 10/100;
        } else {
            thuong = 0;
        }
        this.thunhap = this.luong*this.ngaycong + this.thuong + this.phucap;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + luong*ngaycong + " " + thuong + " " + phucap + " " + thunhap;
    }
    

}
