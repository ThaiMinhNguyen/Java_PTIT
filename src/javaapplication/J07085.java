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

public class J07085 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) sc.readObject();
        for(String i : a){
            int sum = 0;
            String s = "";
            char[] l = i.toCharArray();
            for(char h : l){
                if(Character.isDigit(h)){
                    s += h;
                    sum += Character.getNumericValue(h);
                }
                
            }
            int pos;
            for(pos = 0; pos < s.length(); pos++){
                if(s.charAt(pos)!= '0'){
                    break;
                }
            }
            System.out.println(s.substring(pos) + " " + sum);
        }
    }
}
