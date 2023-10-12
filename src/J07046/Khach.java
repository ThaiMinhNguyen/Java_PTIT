/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07046;

import java.text.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class Khach implements Comparable<Khach> {
    private String ma;
    private String ten;
    private String maphong;
    private String ngayden;
    private String ngaydi;
    private String ngayo;
    static int cnt = 1;

    public Khach(String ten, String maphong, String ngayden, String ngaydi) throws ParseException {
        SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.maphong = maphong;
        this.ngayden = datef.format(datef.parse(ngayden));
        this.ngaydi = datef.format(datef.parse(ngaydi));
        this.ngayo = String.valueOf((datef.parse(ngaydi).getTime() - datef.parse(ngayden).getTime())/(1000*24*60*60));
    }

    public String getNgayo() {
        return ngayo;
    }


    @Override
    public String toString() {
        return ma + " " + ten + " " + maphong + " " + ngayo;
    }

    @Override
    public int compareTo(Khach o) {
        return Integer.parseInt(o.getNgayo()) - Integer.parseInt(ngayo);
    }
    
    
}
