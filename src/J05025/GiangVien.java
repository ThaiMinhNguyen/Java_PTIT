/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05025;

/**
 *
 * @author admin
 */
public class GiangVien implements Comparable<GiangVien>{
    private String ma, ten, khoa;
    static int cnt = 1;

    public GiangVien(String ten, String khoa) {
        this.ma = String.format("GV%02d", cnt++);
        this.ten = ten;
        this.khoa = doi(khoa);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + khoa;
    }
    
    private String doi(String s){
        String[] k = s.split("\\s++");
        String res = "";
        for(String i : k){
            res += i.substring(0,1).toUpperCase();
        }
        return res;
    }

    @Override
    public int compareTo(GiangVien o) {
        String[] t1 = ten.split("\\s++");
        String[] t2 = o.ten.split("\\s++");
        return t1[t1.length - 1].compareTo(t2[t2.length-1]);
    }
    
}
