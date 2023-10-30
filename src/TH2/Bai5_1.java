/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

import java.io.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author admin
 */
public class Bai5_1 {
     public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
//        Scanner sc = new Scanner(System.in);
        Set<String> res = new TreeSet<>();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
        while(sc.hasNextLine()){
            String[] k = sc.nextLine().split("\\s+");
            for(String s : k){
                try{
                    LocalTime time = LocalTime.parse(s, f);
                    System.out.println(time);
                } catch(Exception e){
                    
                }
            }
        }
    }
}
