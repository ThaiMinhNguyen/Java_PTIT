/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT.B4;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        ArrayList<MonHoc> a = new ArrayList<>();
        ArrayList<CaThi> b = new ArrayList<>();
        ArrayList<CaThi> res = new ArrayList<>();
        int t1 = Integer.parseInt(sc1.nextLine());
        while(t1-->0){
            a.add(new MonHoc(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        int t2 = Integer.parseInt(sc2.nextLine());
        while(t2-->0){
            b.add(new CaThi(sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }
        int t = Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String macathi = sc3.next();
            String ma = sc3.next();
            String nhom = sc3.next();
            String sosv = sc3.next();
            for(CaThi i : b){
                if(i.getMa().equals(macathi)){
                    for(MonHoc j : a){
                        if(j.getMa().equals(ma)){
                            i.setA(j);
                            i.setNhom(nhom);
                            i.setSosv(sosv);
                            res.add(i);
                        }
                    }
                }
            }
        }
        Collections.sort(res);
        for(CaThi i : res){
            System.out.println(i);
        }
    }
}
