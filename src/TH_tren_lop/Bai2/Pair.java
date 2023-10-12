/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_tren_lop.Bai2;

/**
 *
 * @author admin
 */
public class Pair implements Comparable<Pair>{
    private Integer a;
    private Integer b;

    public Pair(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    
     
    
    @Override
    public String toString() {
        return "(" + a + "," + b + ')';
    }

//    public int compareTo(Pair o) {
//        if(a != o.a){
//            a - o.a;
//        }
//        return b - o.b;
//    }

    @Override
    public int compareTo(Pair o) {
        if(a != o.a){
            return a - o.a;
        }
       return b - o.b;    
    }
}
