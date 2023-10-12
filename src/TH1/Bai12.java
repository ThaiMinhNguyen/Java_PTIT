/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Bai12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> a1 = (ArrayList<String>)sc1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>)sc2.readObject();
        Set<String> s1 = new TreeSet();
        Set<Integer> s2 = new TreeSet();
//        Set<String> res = new TreeSet();
        s1.addAll(a1);
        s2.addAll(a2);
        for(String i : s1){
            for(Integer j : s2){
                System.out.println(i + j.toString());
            }
        }
    }
}
