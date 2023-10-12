/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07073;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        while(t-->0){
            MonHoc s = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine());
            if(!s.getThuchanh().equals("Truc tiep")){
                a.add(s);
            }
        }
        Collections.sort(a);
        for(MonHoc i : a){
            System.out.println(i);
        }
    }
}
