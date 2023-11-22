/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04019;

/**
 *
 * @author admin
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        double c1 = a.distance(b);
        double c2 = a.distance(c);
        double c3 = b.distance(c);
        if(c1+c2 <= c3 || c1+c3 <= c2 || c2+c3 <= c1){
            return false;
        }
        return true;
    }
    
    public String getPerimeter(){
        double c1 = a.distance(b);
        double c2 = a.distance(c);
        double c3 = b.distance(c);
        return String.format("%.3f", c1 + c2 + c3);
    }
}
