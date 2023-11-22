/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH3.Bai4;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("INSTITUTION.in"));
        Scanner sc2 = new Scanner(new File("REGISTER.in"));
        Map<String, String> vt = new HashMap<>();
        ArrayList<Team> lst = new ArrayList<>();
        int t = Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String[] s = sc1.nextLine().split("\\s++");
            String ten = "";
            for(int i = 1; i < s.length; i++){
                ten += s[i] + " ";
            }
//            System.out.println(s[0]);
            vt.put(s[0], ten);
//            System.out.println(vt.get(s[0]));
        }
        
        int n = Integer.parseInt(sc2.nextLine());
        while(n-->0){
            String[] s = sc2.nextLine().split("\\s++");
            String ten_vt = s[0];
            int k = Integer.parseInt(s[1]);
            for(int i = 0; i < k; i++){
                String ten_team = sc2.nextLine();
                lst.add(new Team(ten_team, vt.get(ten_vt)));
            }
        }
        Collections.sort(lst);
        for(int i = 0; i < lst.size(); i++){
            System.out.print(String.format("team%02d ", (i+1)));
            System.out.println(lst.get(i));
        }
    }
}
