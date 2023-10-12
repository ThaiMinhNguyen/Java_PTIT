/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04022;

import java.io.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class WordSet {
    private TreeSet<String> set;

    public WordSet(String s) {
        set = new TreeSet<>();
        String[] a = s.toLowerCase().split("\\s+");
        for(String l : a){
            set.add(l);
        }
    }

    
    
    public WordSet union(WordSet a){
        WordSet res = new WordSet("");
        res.set.addAll(set);
        res.set.addAll(a.set);
        return res;
    }
    
    public WordSet intersection(WordSet a){
        WordSet res = new WordSet("");
        res.set.addAll(set);
        res.set.retainAll(a.set);
        return res;
    }

    @Override
    public String toString() {
        String s = "";
        for(String l : set){
            s += l + " ";
        }
        return s;
    }
    
    
}
