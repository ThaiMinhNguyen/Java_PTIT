/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai8;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        while(sc.hasNextLine()){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Scanner sc1 = new Scanner(new File("HUONGDAN.in"));
        int t = Integer.parseInt(sc1.nextLine());
        while(t-->0){
           String s = sc1.nextLine();
//           System.out.println(s);
           String ten = s.substring(0, s.length() - 1).trim();
//            System.out.println(ten);
           int n = Character.getNumericValue(s.charAt(s.length()-1));
//            System.out.println(n);
           while(n-->0){
               String k = sc1.nextLine();
               String[] l = k.split("\\s+");
               String msv = l[0];
               String doan = k.substring(msv.length()).trim();
//               System.out.println(msv);
//               System.out.println(doan);
                for(SinhVien i : a){
                    if(msv.equals(i.getMsv())){
                        i.setDetai(doan);
                        i.setGv(ten);
                    }
                }
           }
        }
        Collections.sort(a);
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}
