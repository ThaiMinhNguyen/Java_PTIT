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

class Pair implements Comparable<Pair>{
    public int first;
    public int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    

    @Override
    public int compareTo(Pair o) {
        if(this.first != o.first){
            return this.first - o.first;
        }
        return this.second - o.second;
    }
    
}

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
//        ArrayList<Pair> s = new ArrayList<>();
        Pair[] a = new Pair[t];
        for(int i = 0; i < t; i++){
            a[i] = new Pair(sc.nextInt(), sc.nextInt());
//            s.add(a);
        }
        Arrays.sort(a);
        int crt = 0;
        for(int i = 0; i < t; i++){
            if(crt < a[i].first){
                crt = a[i].first + a[i].second;
            } else {
                crt = crt + a[i].second;
            }
        }
        System.out.println(crt);
    }
}
