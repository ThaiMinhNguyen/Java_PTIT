/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai9;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sp = new ArrayList<>();
        ArrayList<KhachHang> kh = new ArrayList<>();
        while(t-->0){
            sp.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            KhachHang a = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
            for(SanPham i : sp){
                if(i.getMasp().equals(a.getMasp())){
                    a.setNgayhethan(a.getNgaymua().plusMonths(i.getBaohanh()));
                    a.setTong(i.getGiaban()*a.getSoluong());
                }
            }
            kh.add(a);   
        }
        Collections.sort(kh);
        for(KhachHang i : kh){
            System.out.println(i);
        }
    }
}
