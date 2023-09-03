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

public class J02017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = 1;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        while(check == 1){
            check = 0;
            for(int i = 0; i < a.size()-1; i++) {
                int t = a.get(i) + a.get(i+1);
                if(t % 2 == 0) {
                    a.remove(i);
                    a.remove(i);
                    check = 1;
                    break;
                }
            }
           
        }
        
        System.out.println(a.size());
    }
}



