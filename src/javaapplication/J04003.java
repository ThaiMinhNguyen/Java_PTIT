/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author admin
 */
public class J04003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
        PhanSo ps = new PhanSo(sc.nextLong(), sc.nextLong());
        System.out.println(ps.toString());
    }
    
}
class PhanSo {
        private long x;
        private long y;

    public PhanSo(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return (x/gcd(x, y)) + "/" + (y/gcd(x, y));
    }
    
    public long gcd(long a, long b){
        if(a == 0 || b == 0) return a+b;
        return gcd(b, a%b);
    }
   
}