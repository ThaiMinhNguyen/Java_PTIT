/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.*;
import java.lang.*;

public class J04001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
//            a.setX(sc.nextDouble());
//            a.setY(sc.nextDouble());
//            b.setX(sc.nextDouble());
//            b.setY(sc.nextDouble());
//            double s = distance(a, b);
            System.out.printf("%.4f", a.distance(b));
            System.out.println();
        }
    }
    
}

class Point{
    private
        double x;
        double y;
  
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    public Point(Point s) {
        this.x = s.getX();
        this.y = s.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point k) { 
        return Math.sqrt((this.x - k.getX())*(this.x - k.getX()) + (this.y - k.getY())*(this.y - k.getY()));
    }
    
    public double distance(Point a, Point b) {
        return Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY()));
    }
    
    @Override
    public String toString(){
        return "(" + this.x + " " + this.y + ")";
    }
}