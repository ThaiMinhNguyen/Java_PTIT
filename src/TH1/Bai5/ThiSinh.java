/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai5;

/**
 *
 * @author admin
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String ten;
    private String ma_thisinh;
    private String ma_team;
    static int cnt = 1;
    private String ten_team;
    private String ten_truong;

    public ThiSinh(String ten, String ma_team)  {
        this.ma_thisinh = String.format("C%03d", cnt++);
        this.ten = ten;
        this.ma_team = ma_team;
    }

    public String getTen() {
        return ten;
    }
    
    public String getMa_team() {
        return ma_team;
    }

    public void setTen_team(String ten_team) {
        this.ten_team = ten_team;
    }

    public void setTen_truong(String ten_truong) {
        this.ten_truong = ten_truong;
    }

    @Override
    public int compareTo(ThiSinh o) {
        return ten.compareTo(o.getTen());
    }

    @Override
    public String toString() {
        return ma_thisinh + " " + ten + " " + ten_team + " " + ten_truong;
    }
    
    
    
}
