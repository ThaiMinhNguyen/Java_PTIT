/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018;

/**
 *
 * @author admin
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> a = new ArrayList<>();
        while(t-->0){
            String ten = sc.nextLine();
            String diem = sc.nextLine();
            a.add(new HocSinh(ten, diem));
        }
        Collections.sort(a);
        for(HocSinh i : a){
            System.out.println(i);
        }
    }
}
