/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05026;

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
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String ten = doi(sc.nextLine());
            System.out.println(String.format("DANH SACH GIANG VIEN BO MON %s:", ten));
            for(GiangVien i : a){
                if(i.getKhoa().equals(ten)){
                    System.out.println(i);
                }
            }
        }
        
    }
    public static String doi(String s){
        String[] k = s.split("\\s++");
        String res = "";
        for(String i : k){
            res += i.substring(0,1).toUpperCase();
        }
        return res;
    }
}
