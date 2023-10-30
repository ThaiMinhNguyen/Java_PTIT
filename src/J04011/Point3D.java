/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04011;

/**
 *
 * @author admin
 */
public class Point3D {
    private int x;
    private int y;
    private int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
        Point3D p1 = new Point3D(b.x- a.x, b.y-a.y, b.z-a.z);
        Point3D p2 = new Point3D(c.x- a.x, c.y-a.y, c.z-a.z);
        Point3D p3 = new Point3D(d.x- a.x, d.y-a.y, d.z-a.z);
        Point3D v1 = new Point3D(p1.y*p2.z - p1.z*p2.y, p1.z*p2.x - p1.x*p2.z, p1.x*p2.y - p1.y*p2.x);
        int ch = v1.x*p3.x + v1.y*p3.y + v1.z*p3.z;
        if(ch == 0){
            return true;
        } 
        return false;
    }
}
