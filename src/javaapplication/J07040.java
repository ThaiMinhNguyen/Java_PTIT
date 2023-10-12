/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc2 = new Scanner(new File("VANBAN.in"));
        Set<String> l = new TreeSet<>();
        ArrayList<String> a = (ArrayList<String>)(sc1.readObject());
        ArrayList<String> b = new ArrayList<>();
        for(String s : a){
            b.addAll(Arrays.asList(s.trim().toLowerCase().split("\\s+")));
        }
        while(sc2.hasNextLine()){
            String[] k = sc2.nextLine().trim().toLowerCase().split("\\s+");
            for(String s : k){
                if(b.contains(s) && !l.contains(s)){
                    System.out.println(s);
                    l.add(s);
                }
            }
        }
    }
}
