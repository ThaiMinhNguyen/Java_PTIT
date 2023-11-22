/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05040;

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
            NhanVien k = new NhanVien(sc.nextLine(), Long.parseLong(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            sum += k.getTong();
            System.out.println(k);
        }
//        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
