/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04009;

/**
 *
 * @author admin
 */
import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double canh1 = Point.distance(a, b);
            double canh2 = Point.distance(a, c);
            double canh3 = Point.distance(c, b);
//            System.out.println(canh1);
//            System.out.println(canh2);
//            System.out.println(canh3);
            if(canh1 + canh2 <= canh3 || canh1 + canh3 <= canh2 || canh3 + canh2 <= canh1){
                System.out.println("INVALID");
            } else {
                double res = Math.sqrt((canh1+canh2+canh3)*(canh1+canh2-canh3)*(-canh1+canh2+canh3)*(canh1-canh2+canh3))/4;
//                System.out.println(res);
                System.out.println(String.format("%.2f", res));
            }
        }
    }
}
