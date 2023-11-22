/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Complex a = new Complex(sc.nextInt(), sc.nextInt());
            Complex b = new Complex(sc.nextInt(), sc.nextInt());
            Complex c = Complex.plus(a, b);
//            System.out.println(c);
            c = Complex.mul(c, a);
            Complex k = Complex.plus(a, b);
            Complex d = Complex.mul(k, k);
            System.out.println(c + ", " + d);
        }
    }
}

class Complex{
    private int re;
    private int im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }
    
    public static Complex plus(Complex a, Complex b){
        Complex res = new Complex(0, 0);
        res.re = a.re + b.re;
        res.im = a.im + b.im;
        return res;
    }
    
    public static Complex mul(Complex a, Complex b){
        Complex res = new Complex(0, 0);
        res.re = a.re*b.re - a.im*b.im;
        res.im = a.re*b.im + a.im*b.re;
        return res;
    }

    @Override
    public String toString() {
        if(this.im >= 0){
            return re + " + " + im + 'i';
        }
        else {
            return re + " - " + (-im) + 'i';
        }
    }
    
    
}