/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

/**
 *
 * @author admin
 */
import java.util.*;


public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        Set<String> s1 = new TreeSet();
        while(n1-->0){
            s1.addAll(Arrays.asList(sc.nextLine().toLowerCase().split("\\s+")));
        }
        int n2 = Integer.parseInt(sc.nextLine());
        Set<String> s2 = new TreeSet();
        while(n2-->0){
            s2.addAll(Arrays.asList(sc.nextLine().toLowerCase().split("\\s+")));
        }
        for(String i : s1){
            if(!s2.contains(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(String i : s2){
            if(!s1.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}
