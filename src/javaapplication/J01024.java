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


public class J01024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            char[] a = s.toCharArray();
            int check = 1;
            for(int i = 0; i < a.length; i++){
                if(a[i] != '0' && a[i] != '1' && a[i] != '2'){
                    check = 0;
                    break;
                }
            }
            if(check == 1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
