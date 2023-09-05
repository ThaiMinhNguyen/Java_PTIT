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

public class J04002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.next());
        Rectangle r = new Rectangle();
        double x = sc.nextDouble();
        r.setHeight(x);
        double y = sc.nextDouble();
        r.setWidth(y);
        String c = sc.next().toLowerCase();
        c = String.valueOf(c.charAt(0)).toUpperCase() + c.substring(1);
        r.setColour(c);
        if(r.getHeight() > 0 && r.getWidth() > 0) { 
            System.out.printf("%.0f %.0f %s" ,r.findPerimeter(), r.findArea(), r.getColour());
        } else {
            System.out.print("INVALID");
        }
    }
}

class Rectangle {
    private
        double width;
        double height;
        String colour;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public double findArea(){
        return this.height*this.width;
    }
    
    public double findPerimeter(){
        return 2*(this.height + this.width);
    }
}