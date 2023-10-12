/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai5;

/**
 *
 * @author admin
 */
public class Team {
    private String ma_team;
    private String ten_team;
    private String ten_truong;
    static int cnt = 1;

    public Team(String ten_team, String ten_truong) {
        this.ma_team = String.format("Team%02d", cnt++);
        this.ten_team = ten_team;
        this.ten_truong = ten_truong;
    }

    public String getMa_team() {
        return ma_team;
    }
    
    
    public String getTen_team() {
        return ten_team;
    }

    public String getTen_truong() {
        return ten_truong;
    }
    
    
}
