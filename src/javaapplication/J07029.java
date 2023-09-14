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

public class J07029 {
    public static boolean isPrime(int x){
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return x > 1;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)(sc.readObject());
        int[] s = new int[1000002];
        ArrayList<Integer> k = new ArrayList<>();
        for(Integer i : a) {
            if(isPrime(i)){
                if(s[i] == 0) {
                    k.add(i);
                }
                s[i]++;
            }
        }
        Collections.sort(k, Collections.reverseOrder());
        for(int i = 0; i < 10; i++){
            System.out.println(k.get(i) + " " + s[k.get(i)]);
        }
    }
}
