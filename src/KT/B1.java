/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;

public class B1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> a = new TreeSet<>();
        while(sc.hasNextLine()){
            String[] k = sc.nextLine().trim().split("\\s++");
            for(String s : k){
                int check = 0;
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '!' || s.charAt(i) == '?' || s.charAt(i) == ':'){
                        check = 0;
                        break;
                    }
                    if(Character.isDigit(s.charAt(i))){
                        check = 1;
                    }
                }
                if(check == 1){
                    a.add(s);
                }
            }
        }
//        Collections.sort(a);
        for(String i : a){
            System.out.println(i);
        }
    }
}
