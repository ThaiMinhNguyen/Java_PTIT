/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.*;

public class J03010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> ten = new ArrayList<>();
        while(t-->0) {
            String[] x = sc.nextLine().trim().toLowerCase().split("\\s+");
            String res = "";
            res = res + x[x.length-1];
            for(int i = 0; i < x.length-1; i++) {
                res+= x[i].charAt(0);
            }
            ten.add(res);
            int s = Collections.frequency(ten, res);
            if(s >= 2) res = res + Integer.toString(s);
            System.out.println(res + "@ptit.edu.vn");
        }
    }
}
