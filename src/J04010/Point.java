/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04010;

/**
 *
 * @author admin
 */
public class Point {
    private double x;
    private double y;

    public Point() {
    }
        
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
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
    
    public static double distance(Point a, Point b) {
        return Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY()));
    }
    
    @Override
    public String toString(){
        return "(" + this.x + " " + this.y + ")";
    }
}
