/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai5;

/**
 *
 * @author admin
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Team> t = new ArrayList<>();
        while(n-->0){
            t.add(new Team(sc.nextLine(), sc.nextLine()));
        }
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ts = new ArrayList<>();
        while(k-->0){
            ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine());
            for(Team i : t){
                if(i.getMa_team().equals(a.getMa_team())){
                    a.setTen_team(i.getTen_team());
                    a.setTen_truong(i.getTen_truong());
                }
            }
            ts.add(a);
        }
        Collections.sort(ts);
        for(ThiSinh i : ts){
            System.out.println(i);
        }
    }
}

//2
//BAV_MIS
//Banking Academy of Vietnam
//FTU Knights1
//Foreign Trade University
//6
//Le Trung Toan
//Team01
//Nguyen Trinh Quoc Long
//Team01
//Giang Minh Tung
//Team01
//Nguyen Hang Giang
//Team02
//Nguyen Thanh Nhan
//Team02
//Nguyen Viet Duc
//Team02