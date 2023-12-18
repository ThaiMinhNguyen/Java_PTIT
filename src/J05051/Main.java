/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05051;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TienDien> s = new ArrayList<>();
        while(t-->0){
            TienDien a = new TienDien(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            s.add(a);
            
        }
        Collections.sort(s);
        for(TienDien i : s){
            System.out.println(i);
        }
    }
}
