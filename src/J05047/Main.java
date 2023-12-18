/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05047;

/**
 *
 * @author admin
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Hang> a = new ArrayList<>();
        while(t-->0){
            Hang k = new Hang(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            a.add(k);
        }
        Collections.sort(a);
        for(Hang i : a){
            System.out.println(i);
        }
    }
}