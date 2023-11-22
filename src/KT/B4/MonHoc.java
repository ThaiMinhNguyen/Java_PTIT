/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT.B4;

/**
 *
 * @author admin
 */
import java.util.*;

public class MonHoc  {
    private String ma, ten, hinhthuc;
//    private Date ngay, gio;

    public MonHoc(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }


    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ten;
    }
    
    
}
    
    
