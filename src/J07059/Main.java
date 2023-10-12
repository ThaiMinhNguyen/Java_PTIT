/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07059;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> a = new ArrayList<>();
        while(t-->0){
            a.add(new CaThi(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a);
        for(CaThi i : a){
            System.out.println(i);
        }
    }
}
