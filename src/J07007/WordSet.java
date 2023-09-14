/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07007;

import java.util.*;
import java.io.*;

/**
 *
 * @author admin
 */

public class WordSet {
    private Set<String> a = new TreeSet<>();

    public WordSet(String s) throws IOException {
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()) {
            a.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(String i : a) {
            res = res + i + "\n"; 
        }
        return res;
    }
    
    
    
}
