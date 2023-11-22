/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05042;

/**
 *
 * @author admin
 */
public class HocSinh implements Comparable<HocSinh>{
    private String ten;
    private int baidung, submit;

    public HocSinh(String ten, String s) {
        this.ten = ten;
        String[] k = s.split("\\s++");
        this.baidung = Integer.parseInt(k[0]);
        this.submit = Integer.parseInt(k[1]);
    }

    @Override
    public String toString() {
        return ten + " " + baidung + " " + submit;
    }

    
    @Override
    public int compareTo(HocSinh o) {
        if(baidung != o.baidung){
            return - (baidung - o.baidung);
        }
        if(submit != o.submit){
            return submit - o.submit;
        }
        return ten.compareTo(o.ten);
    }
    
    
}
