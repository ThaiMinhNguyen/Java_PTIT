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

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =  new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String k = sc.nextLine();
            if(k.equals("END")){
                break;
            }
//            String[] s = sc.nextLine().toLowerCase().trim().split("\\s+");
            String[] s = k.toLowerCase().trim().split("\\s+");
            for(String i : s) {
                System.out.print(Character.toString(i.charAt(0)).toUpperCase() + i.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
