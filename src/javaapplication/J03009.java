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

public class J03009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String[] x = sc.nextLine().split("\\s");
            String[] y = sc.nextLine().split("\\s");
            Set<String> s = new HashSet<String>();
//            List<String> x1 = ArrayList<String>(Arrays.asList(x));
//            List<String> y1 = ArrayList<String>(Arrays.asList(y));
            for(String i : x) {
                int check = 1;
                for(String j : y) {
                    if(i.equals(j)) {
                        check = 0;
                        break;
                    }
                }
                if(check == 1) {
                    s.add(i);
                }
            }
            for(String i : s) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
