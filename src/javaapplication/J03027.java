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

public class J03027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        while(true) {
            int check = 0;
            for(int i = 1; i < a.length(); i++){
                if(a.charAt(i) == a.charAt(i-1)) {
                    check = 1;
                    a = a.substring(0,i-1) + a.substring(i+1);
                    break;
                }
            } 
            if(check == 0){
                break;
            }
        }
        if(a.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(a);
        }
    }
}
