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

public class Bai8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> a1 = (ArrayList<String>)sc1.readObject();
        ArrayList<String> a2 = (ArrayList<String>)sc2.readObject();
        Set<String> s1 = new TreeSet();
        s1.addAll(a1);
        for(String i : s1){
            if(check(i) && a2.contains(i)){
                System.out.println(i + " " + Collections.frequency(a1, i) + " " + Collections.frequency(a2, i));
            }
        }
    }
    
    public static boolean check(String a){
        if(a.length()<2) return false;
        for(int i = 0; i < a.length()-1; i++){
            if(Character.getNumericValue(a.charAt(i)) > Character.getNumericValue(a.charAt(i+1))){
                return false;
            }
        } 
        return true;
    }
}
