/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.*;

public class J03020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        int len = 0;
        String m = "";
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            m = m + line + " ";
            if(line.isEmpty()){
                break;
            }
        }
        String[] lk = m.trim().split("\\s+");
        for(String s : lk){            
//                String s = sc.next();
            res.add(s);
            StringBuilder k = new StringBuilder();
            k.append(s);
            String l = k.reverse().toString();
            if(l.equals(s) && !a.contains(s)){
                a.add(s);
                len = Integer.max(len, s.length());
            }
        }
//        System.out.println(len);
        for(String i : a){
            if(i.length() == len){
                System.out.println(i + " " + Collections.frequency(res, i));
            }
        }
    }
}
