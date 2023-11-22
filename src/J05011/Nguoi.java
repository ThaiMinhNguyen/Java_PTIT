/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05011;

/**
 *
 * @author admin
 */
public class Nguoi implements Comparable<Nguoi> {
    private String ma;
    private String ten;
    private String giovao;
    private String giora;
    private int time;

    public Nguoi(String ma, String ten, String giovao, String giora) {
        this.ma = ma;
        this.ten = ten;
        this.giovao = giovao;
        this.giora = giora;
        this.time = doi(giora) - doi(giovao);
    }
    
    private int doi(String s){
        String[] k = s.split(":");
        int m = Integer.parseInt(k[1]);
        int h = Integer.parseInt(k[0]) * 60;
        return m+h;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + (int)time/60 + " gio " + time%60 + " phut";
    }
    
    
    
    @Override
    public int compareTo(Nguoi o) {
        return -(time - o.time);
    }
    
    
    
}
