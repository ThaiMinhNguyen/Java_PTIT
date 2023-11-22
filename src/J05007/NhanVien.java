/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007;

import java.util.*;

/**
 *
 * @author admin
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma;
    private String ten;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;
    private String masothue;
    private String ngayky;
    static int cnt = 1;

    public NhanVien(Scanner sc) {
        this.ma = String.format("%05d", cnt++);
        this.ten = sc.nextLine();
        this.gioitinh = sc.nextLine();
        this.ngaysinh = sc.nextLine();
        this.diachi = sc.nextLine();
        this.masothue = sc.nextLine();
        this.ngayky = sc.nextLine();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + ngaysinh + " " + diachi + " " + masothue + " " + ngayky;
    }

    @Override
    public int compareTo(NhanVien o) {
        String [] ngay1 = ngaysinh.split("/");
        String [] ngay2 = o.ngaysinh.split("/");
        if(!ngay1[2].equals(ngay2[2])){
            return ngay1[2].compareTo(ngay2[2]);
        } else if(!ngay1[1].equals(ngay2[1])){
            return ngay1[1].compareTo(ngay2[1]);
        }
        return ngay1[0].compareTo(ngay2[0]);
    }
    
    
    
}
