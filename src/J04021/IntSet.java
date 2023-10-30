/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04021;

/**
 *
 * @author admin
 */
import java.util.*;
public class IntSet {
     private TreeSet<Integer> a;

    public IntSet(int[] b) {
        a = new TreeSet<>();
        for(int i = 0; i < b.length; i++){
            a.add(b[i]);
        }
    }
    
    public IntSet union(IntSet s){
        TreeSet<Integer> res = new TreeSet<>();
        res.addAll(a);
        res.addAll(s.a);
        int[] k = new int[res.size()];
        int j = 0;
        for(int i : res){
            k[j++] = i;
        }
        IntSet r = new IntSet(k);
        return r;
    }

    @Override
    public String toString() {
        String s = "";
        for(Integer i : a){
            s += i.toString() + " ";
        }
        return s;
    }
    
}
