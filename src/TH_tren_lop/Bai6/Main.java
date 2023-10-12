/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_tren_lop.Bai6;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
//        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        ArrayList<String> ds = new ArrayList<>();
        while(sc.hasNextLine()){
            MonHoc s = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(!ds.contains(s.getMa())){
                ds.add(s.getMa());
                a.add(s);
            }
        }
        Collections.sort(a);
        for(MonHoc i : a){
            System.out.println(i);
        }
    }
}
