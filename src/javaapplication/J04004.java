/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J04004 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo p2 = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo p3 = p1.cong(p2);
        System.out.println(p3.toString());
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
    
    public PhanSo cong(PhanSo b){
        long ax = this.x*b.getY()+this.y*b.getX();
        long ay = this.y*b.getY();
        return new PhanSo(ax, ay);
    }
}