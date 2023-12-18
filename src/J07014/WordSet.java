/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07014;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;

public class WordSet {
    private String file;
    private Set<String> s = new TreeSet<>();

    public WordSet(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNextLine()){
            String[] k = sc.nextLine().toLowerCase().split("\\s++");
            for(String i : k){
                s.add(i);
            }
        }
    }
    
    public String union(WordSet a){
        String res = "";
        Set<String> r = new TreeSet<>();
        r.addAll(s);
        r.addAll(a.s);
        for(String i : r){
            res += i + " ";
        }
        return res;
    }
    
    public String intersection(WordSet a){
        String res = "";
        Set<String> r = new TreeSet<>();
        r.addAll(s);
        r.retainAll(a.s);
        for(String i : r){
            res += i + " ";
        }
        return res;
    }
    
}
