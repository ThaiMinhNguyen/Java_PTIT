/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai10;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        List<MonHoc> mh = new ArrayList<>();
        List<GiangVien> gv = new ArrayList<>();
        int t = Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String k = sc1.nextLine();
            String[] s = k.split("\\s+");
            mh.add(new MonHoc(s[0], k.substring(s[0].length()).trim()));
        }
        int n = Integer.parseInt(sc2.nextLine());
        while(n-->0){
            String k = sc2.nextLine();
            String[] s = k.split("\\s+");
            gv.add(new GiangVien(s[0], k.substring(s[0].length()).trim()));
        }
        int k = sc3.nextInt();
        while(k-->0){
            String ma = sc3.next();
            String mamon = sc3.next();
            double gio = Double.parseDouble(sc3.next());
//            System.out.println(gio);
            for(GiangVien i : gv){
                if(ma.equals(i.getMa())){
                    i.setGio(i.getGio() + gio);
                }
            }
        }
        for(GiangVien i : gv){     
            System.out.println(i);
        }
    }
}
