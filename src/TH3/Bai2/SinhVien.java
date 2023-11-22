/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH3.Bai2;

/**
 *
 * @author admin
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private Date start;
    private Date end;
    private long phut;

    public SinhVien(String name, String start, String end) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.name = name;
        this.start = date.parse(start);
        this.end = date.parse(end);
        phut = ChronoUnit.MINUTES.between(this.start.toInstant(), this.end.toInstant());
    }
   
    @Override
    public String toString() {
        return name + " " + phut;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(phut != o.phut){
            return -Long.compare(phut, o.phut);
        }
        return name.compareTo(o.name);
    }
    
    
}
