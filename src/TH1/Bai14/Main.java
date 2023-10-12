/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai14;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        Scanner sc3 = new Scanner(new File("NHIEMVU.in"));
        ArrayList<SinhVien> ds = new ArrayList<>();
        ArrayList<DeTai> ls = new ArrayList<>();
        int t = Integer.parseInt(sc1.nextLine());
        while(t-->0){
            ds.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        int k = Integer.parseInt(sc2.nextLine());
        while(k-->0){
            ls.add(new DeTai(sc2.nextLine(), sc2.nextLine()));
        }
        int n = Integer.parseInt(sc3.nextLine());
        while(n-->0){
            String[] s = sc3.nextLine().split("\\s+");
            for(SinhVien i : ds){
                if(i.getMaSv().equals(s[0])){
                    for(DeTai j : ls){
                        if(j.getMa().equals(s[1])){
                            i.setDetai(j);
                        }
                    }
                }
            }
        } 
        Collections.sort(ds);
        for(SinhVien i : ds){
            System.out.println(i);
        }
    }
}
