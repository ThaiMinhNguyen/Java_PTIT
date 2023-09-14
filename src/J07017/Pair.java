/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07017;

/**
 *
 * @author admin
 */
//import java.lang.*;

public class Pair<K, V> {
    private K a;
    private V b;

    public Pair(K a, V b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean isPrime(){
        for(int i = 2; i <= (int)Math.sqrt((Integer)a); i++){
            if((Integer)a % i == 0) {
                return false;
            }
        }
        for(int i = 2; i <= (int)Math.sqrt((Integer)b); i++){
            if((Integer)b % i == 0) {
                return false;
            }
        }
        return ((Integer)a > 1 && (Integer)b > 1);
    }
    
    
    @Override
    public String toString() {
        return a + " " + b;
    }
    
    
}
