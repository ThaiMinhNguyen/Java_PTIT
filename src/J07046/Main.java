/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07046;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in")); 
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> a = new ArrayList<>();
        while(t-->0) {
            a.add(new Khach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(Khach i : a){
            System.out.println(i);
        }
    } 
}
