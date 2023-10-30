/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Bai2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) sc2.readObject();
        ArrayList<Integer> sum = new ArrayList<>();
        Set<Integer> s = new TreeSet<>();
        s.addAll(a1);
//        sum.addAll(a1);
//        sum.retainAll(a2);
//        s.addAll(sum);
//        for(Integer i : s){
//            if(check(i)){
//                System.out.println(i + " " + Collections.frequency(a1, i) + " " + Collections.frequency(a2, i));
//            }
//        }
//        Collections.sort(a1);
        for(Integer i : s){
            if(check(i)){
                if(a2.contains(i)){
                    System.out.println(i + " " + Collections.frequency(a1, i) + " " + Collections.frequency(a2, i));
                }
            }
        }
    }
    
    public static boolean check(Integer a){
        String s = a.toString();
        if(s.length() < 2) return false;
        for(int i = 1; i < s.length(); i++){
            if(Character.getNumericValue(s.charAt(i-1)) > Character.getNumericValue(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
