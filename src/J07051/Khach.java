/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07051;

import java.text.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 *
 * @author admin
 */
public class Khach implements Comparable<Khach> {
    private String ma;
    private String ten;
    private String sophong;
    private Date ngaynhan;
    private Date ngaytra;
    private String tienphatsinh;
    private int ngayo;
    private int thanhtien;
    static int cnt = 1;

    public Khach(String ten, String sophong, String ngaynhan, String ngaytra, String tienphatsinh) throws ParseException {
        this.ma = String.format("KH%02d", cnt++);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        this.ten = chuanhoa(ten);
        this.sophong = sophong;
        this.ngaynhan = date.parse(ngaynhan);
        this.ngaytra = date.parse(ngaytra);
        this.tienphatsinh = tienphatsinh;
        this.ngayo = (int) (ChronoUnit.DAYS.between(this.ngaynhan.toInstant(),this.ngaytra.toInstant()) + 1);
        if(sophong.charAt(0) == '1'){
            this.thanhtien = 25*ngayo + Integer.parseInt(tienphatsinh);
        } else if(sophong.charAt(0) == '2'){
            this.thanhtien = 34*ngayo + Integer.parseInt(tienphatsinh);
        } else if(sophong.charAt(0) == '3'){
            this.thanhtien = 50*ngayo + Integer.parseInt(tienphatsinh);
        } else {
            this.thanhtien = 80*ngayo + Integer.parseInt(tienphatsinh);
        }
    }

    public int getThanhtien() {
        return thanhtien;
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
        return ma + " " + ten + " " + sophong + " " + ngayo + " " + thanhtien;
    }

        
    
    @Override
    public int compareTo(Khach o) {
        return o.getThanhtien() - thanhtien;
    }
    
    
}
