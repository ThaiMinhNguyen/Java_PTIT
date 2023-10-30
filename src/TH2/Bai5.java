/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

/**
 *
 * @author admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.text.*;
import java.util.*;

public class Bai5 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("VANBAN.in"));
        Scanner sc = new Scanner(System.in);
        Set<String> res = new TreeSet<>();
        SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss");
        while(sc.hasNextLine()){
            String[] k = sc.nextLine().split("\\s+");
            for(String s : k){
                try{
                    date.parse(s);
                    s = date.format(date.parse(s));
//                    System.out.println(s);
                    res.add(s);
                } catch(ParseException e){
                }
//                System.out.println(s);
            }
        }
        for(String i : res){
            System.out.println(i);
        }
    }
}
