/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05049;

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
        ArrayList<Hang> s = new ArrayList<>();
        while(t-->0){
            Hang a = new Hang(sc.nextLine(), Long.parseLong(sc.nextLine()));
            s.add(a);
        }
        String c = sc.nextLine();
        Collections.sort(s);
        for(Hang i : s){
            if(i.getMa().startsWith(c)){
                System.out.println(i);
            }
        }
    }
}


