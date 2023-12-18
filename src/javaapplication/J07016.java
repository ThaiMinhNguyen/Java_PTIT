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

public class J07016 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sangnto();
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>)(sc1.readObject());
        ArrayList<Integer> a2 = (ArrayList<Integer>)(sc2.readObject());
        Set<Integer> a = new TreeSet<>();
        Collections.sort(a1);
        a.addAll(a1);
        for(Integer i : a){
            if(ak[i] == true && a2.contains(i)){
                System.out.println(i + " " + Collections.frequency(a1, i) + " " + Collections.frequency(a2, i));
            }
        }
    }
    
    private static boolean[] ak = new boolean[10001];
    private static void sangnto() {
        for(int i=0;i <= 10000;i++) ak[i] = true;
        ak[0] = ak[1] = false;
        for(int i = 2;i <=105;i++)
        {
            if(ak[i]) for(int j=i*i; j <= 10000;j+=i) ak[j] = false;
        }

    }
    
    public static boolean check(Integer a){
        for(int i = 2; i <= (int)Math.sqrt(a) + 1; i++){
            if(a % i == 0){
                return false;
            }
        }
        return a > 1;
    }
}
