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

public class J07032 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)(sc1.readObject());
        ArrayList<Integer> b = (ArrayList<Integer>)(sc2.readObject());
        Set<Integer> s1 = new TreeSet<>(a);
        Set<Integer> s2 = new TreeSet<>(b);
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer i : s1){
            if(CheckP(i) && s2.contains(i)){
                ans.add(i);
            }
            if(ans.size() == 10){
                break;
            }
        }
        for(Integer i : ans){
            System.out.println(i + " " + (Collections.frequency(a, i) + Collections.frequency(b, i)));
        }
    } 

    public static boolean CheckP(Integer f){
        char[] s = f.toString().toCharArray();
        if(s.length < 2 || s.length % 2 == 0) {
            return false;
        }
        for(int i = 0; i <= s.length/2; i++){
            if(Character.getNumericValue(s[i]) % 2 == 0){
                return false;
            }
            if(s[i] != s[s.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
