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

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int sum = 0;
            char[] s = sc.nextLine().toCharArray();
//            for(char i : s){
//                System.out.println(i);
//            }
            ArrayList<Character> a = new ArrayList<>();
            for(char i : s){
                if(Character.isDigit(i)){
                    sum += Character.getNumericValue(i);
                } else {
                    a.add(i);
                }
            }
            Collections.sort(a);
            for(char i : a){
                System.out.print(i);
            }
            System.out.println(sum);
        }
    }
}
