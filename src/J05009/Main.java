/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int c = 1;
        ArrayList<ThiSinh> s = new ArrayList<>();
        while(t-->0){
            ThiSinh a = new ThiSinh(c++, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            s.add(a);
        }
        Collections.sort(s);
        double max = s.get(0).getTong();
        for(ThiSinh i : s){
            if(i.getTong() == max){
                System.out.println(i);
            } else {
                break;
            }
        }
    }
}
