/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07072;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Ten> a = new ArrayList<>();
        while(sc.hasNextLine()){
            a.add(new Ten(sc.nextLine()));
        }
        Collections.sort(a);
        for(Ten i : a){
            System.out.println(i);
        }
    }
    
}
