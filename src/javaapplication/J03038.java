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

public class J03038 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] x = sc.nextLine().toCharArray();
        Set<Character> a = new HashSet<Character>();
        for(int i = 0; i < x.length; i++) {
            a.add(x[i]);
        }
        System.out.print(a.size());
    }
}
