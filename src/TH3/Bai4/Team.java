/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH3.Bai4;

/**
 *
 * @author admin
 */
public class Team implements Comparable<Team>{
    private String ten;
    private String tentruong;

    public Team(String ten, String tentruong) {
        this.ten = ten;
        this.tentruong = tentruong;
    }

    @Override
    public int compareTo(Team o) {
        if(tentruong != o.tentruong){
            return tentruong.compareTo(o.tentruong);
        }
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ten +  " " + tentruong;
    }
    
    
    
}
