/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07084;

/**
 *
 * @author admin
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class SinhVien implements Comparable<SinhVien> {
    private String ten;
    private Date timestart;
    private Date timeend;
    private long min;

    public SinhVien(String ten, String timestart, String timeend) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.ten = ten;
        this.timestart = date.parse(timestart);
        this.timeend = date.parse(timeend);
        min = ChronoUnit.MINUTES.between(this.timestart.toInstant(), this.timeend.toInstant());
    }

    @Override
    public String toString() {
        return ten + " " + min;
    }
    
    
    @Override
    public int compareTo(SinhVien o) {
        return  -Long.compare(min, o.min);
    }
    
    
}
