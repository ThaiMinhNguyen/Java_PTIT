/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05025;

/**
 *
 * @author admin
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> a = new ArrayList<>();
        while(t-->0){
            a.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(GiangVien i : a){
            System.out.println(i);
        }
    }
}
