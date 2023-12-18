/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054;



/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            HocSinh s = new HocSinh(sc.nextLine(), Double.parseDouble(sc.nextLine()));
            a.add(s);
        }
        Collections.sort(a);
        int stt = 1;
        a.get(0).setStt(stt);
        stt++;
        for(int i = 1; i < a.size(); i++){
            if (a.get(i-1).getDiem() == a.get(i).getDiem()){
                a.get(i).setStt(a.get(i-1).getStt());
                stt++;
            }else{
                a.get(i).setStt(stt);
                stt++;
            }
        }
        Collections.sort(a, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh a, HocSinh b){
                return a.getMa().compareTo(b.getMa());
            }
        });
        for(HocSinh i : a){
            System.out.println(i);
        }
    }
}
