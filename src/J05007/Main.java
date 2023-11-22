/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007;

/**
 *
 * @author admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> s = new ArrayList<>();
        while(t-->0){
            NhanVien a = new NhanVien(sc);
            s.add(a);
        }
        Collections.sort(s);
        for(NhanVien i : s){
            System.out.println(i);
        }
    }
}