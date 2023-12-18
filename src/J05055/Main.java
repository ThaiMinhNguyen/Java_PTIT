/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05055;

import java.util.*;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> s = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            s.add(a);
        }
        Collections.sort(s);
        int stt = 1;
        s.get(0).setStt(stt);
        stt++;
        for(int i = 1; i < s.size(); i++){
            if(s.get(i).getUt().compareTo(s.get(i-1).getUt()) == 0){
                s.get(i).setStt(s.get(i-1).getStt());
                stt++;
            } else {
                s.get(i).setStt(stt);
                stt++;
            }
        }
        Collections.sort(s, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh a, ThiSinh b) {
                return a.getMa().compareTo(b.getMa());
            }
            
        });
        
        for(ThiSinh i : s){
            System.out.println(i);
        }
    }
}
