/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05045;

/**
 *
 * @author admin
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        long sum = 0;
        ArrayList<NhanVien> a = new ArrayList<>();
        while(t-->0){
            NhanVien k = new NhanVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            a.add(k);
        }
        Collections.sort(a);
        for(NhanVien i : a){
            System.out.println(i);
        }
    }
}

