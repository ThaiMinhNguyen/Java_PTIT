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
import java.lang.*;

public class J07031 {
    public static boolean isPrime(int x){
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return x > 1;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)(sc1.readObject());
        ArrayList<Integer> b = (ArrayList<Integer>)(sc2.readObject());
        int[] s = new int[1000002];
        Set<Integer> k = new TreeSet<>();
        for(Integer i : a) {
            if(isPrime(i)){
                if(i < 1000000 - i && b.contains(1000000 - i) == false && isPrime(1000000 - i) && b.contains(i) == false && a.contains(1000000-i)) {
                    k.add(i);
                }
            }
        }
//        Collections.sort(k);
        for(Integer i : k){
            System.out.println(i + " " + (1000000 - i));
        }
    }
}
