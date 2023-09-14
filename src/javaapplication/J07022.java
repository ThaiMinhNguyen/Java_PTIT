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

public class J07022 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int t = Integer.parseInt(s);
            } catch(Exception e){
                a.add(s);
            }
            Collections.sort(a);
        }
        for(String i : a){
            System.out.print(i + " ");
        }
    }
}
