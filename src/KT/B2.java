/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class B2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> a = (ArrayList<String>) sc1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) sc2.readObject();
        Set<String> a1 = new TreeSet<>();
        Set<Integer> b1 = new TreeSet<>();
        Set<String> res = new TreeSet<>();
        a1.addAll(a);
        b1.addAll(b);
        for(String i : a1){
            for(Integer j : b1){
                res.add(i + j.toString());
            }
        }
        for(String i : res){
            System.out.println(i);
        }
    }
}
