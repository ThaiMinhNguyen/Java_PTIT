/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07052;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        while(t-->0){
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        int k = Integer.parseInt(sc.nextLine());
        double diemchuan = a.get(k-1).getDiem();
        System.out.println(diemchuan);
        for(ThiSinh i : a){
            System.out.print(i);
            if(i.getDiem() >= diemchuan){
                System.out.println(" TRUNG TUYEN");
            } else {
                System.out.println(" TRUOT");
            }
        }
    }
}
