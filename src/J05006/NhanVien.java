/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05006;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NhanVien {
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
    
    
    
}
