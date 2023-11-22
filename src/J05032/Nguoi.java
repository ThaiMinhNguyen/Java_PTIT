/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05032;

import java.text.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class Nguoi implements Comparable<Nguoi>{
    private String name;
    private Date dob;

    public Nguoi(String name, String dob) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        this.name = name;
        this.dob = date.parse(dob);
    }

    @Override
    public int compareTo(Nguoi o) {
        return dob.compareTo(o.dob);
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
