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
import java.io.*;
//de bai co ham main nen lam ra cho khac
public class J07014 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        Set<String> a1 = new TreeSet<>();
        Set<String> a2 = new TreeSet<>();
        Set<String> res1 = new TreeSet<>();
        Set<String> res2 = new TreeSet<>();
        while(sc1.hasNextLine()){
            String[] k = sc1.nextLine().toLowerCase().split("\\s++");
            for(String i : k){
                a1.add(i);
            }
        }
        while(sc2.hasNextLine()){
            String[] k = sc2.nextLine().toLowerCase().split("\\s++");
            for(String i : k){
                a2.add(i);
            }
        }
        res1.addAll(a2);
        res1.addAll(a1);
        res2.addAll(a2);
        res2.retainAll(a1);
        for(String i : res1){
            System.out.print(i + " ");
        }
        System.out.println();
        for(String i : res2){
            System.out.print(i + " ");
        }
    }
}
