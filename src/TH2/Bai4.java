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


public class Bai4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> res = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                res.add(s);
            }
        }
        for(String i : res){
            System.out.println(i);
        }
    }
    public static boolean check(String s){
        int check = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                check = 1;
            }
            if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == ':'){
                return false;
            }
        }
        if(check == 1) return true;
        return false;
    }
}
