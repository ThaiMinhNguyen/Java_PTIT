/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07071;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Ten implements Comparable<Ten> {
    private ArrayList<String> s = new ArrayList<>();
    private String t;
    private String tenchuan;
    private String ho;

    public Ten(String t) {
        this.t = t;
        String[] l = t.split("\\s+");
        tenchuan = l[l.length-1];
        ho = l[0];
        for(String i : l){
            s.add(Character.toString(i.charAt(0)));
        }
    }

    public String getT() {
        return t;
    }

    public ArrayList<String> getS() {
        return s;
    }

    public String getTenchuan() {
        return tenchuan;
    }

    public String getHo() {
        return ho;
    }
    
    
    @Override
    public String toString() {
        return t;
    }
    
    
    @Override
    public int compareTo(Ten o) {
        if(!tenchuan.equals(o.getTenchuan())){
            return tenchuan.compareTo(o.getTenchuan());
        }
        return ho.compareTo(o.getHo());
    }
    
    
}
