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


public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        ArrayList<String> res = new ArrayList<>();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            s += line + " ";
            if(line.isEmpty()){
                break;
            }
        }
        String[] k = s.trim().toLowerCase().split("\\s+");
        String c = "";
        for(String i : k){
            if(i.charAt(i.length()-1) == '.' || i.charAt(i.length()-1) == '!' ||i.charAt(i.length()-1) == '?'){
                c += i.substring(0, i.length() - 1);
                res.add(Character.toString(c.charAt(0)).toUpperCase() + c.substring(1));
                c = "";
            } else {
                c += i + " ";
            }
        }
        for(String i : res){
            System.out.println(i);
        }
    }
}
