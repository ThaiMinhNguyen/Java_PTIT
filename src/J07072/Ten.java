/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07072;

/**
 *
 * @author admin
 */
public class Ten implements Comparable<Ten> {
    private String fullname;
    private String ten;
    private String ho;
    private String tendem;

    public Ten(String fullname) {
        this.fullname = chuanhoa(fullname);
        String[] s = this.fullname.split("\\s+");
        ten = s[s.length-1];
        ho = s[0];
        tendem = "";
        for(int i = 1; i < s.length-1; i++){
            tendem += s[i] + " ";
        }
    }

    public String getTen() {
        return ten;
    }

    public String getHo() {
        return ho;
    }

    public String getTendem() {
        return tendem;
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
        return fullname;
    }

    
    
    @Override
    public int compareTo(Ten o) {
        if(!ten.equals(o.getTen())){
            return ten.compareTo(o.getTen());
        }
        if(!ho.equals(o.getHo())){
            return ho.compareTo(o.getHo());
        }
        return tendem.compareTo(o.getTendem());
    }
}
