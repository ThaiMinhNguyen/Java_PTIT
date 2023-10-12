/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

import java.io.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class Bai11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) sc.readObject();
        for(String m : a){
            String k = "";
            for(int i = 0; i < m.length(); i++){
                if(m.charAt(i) == '1' || m.charAt(i) == '0'){
                    k += m.charAt(i);
                }
            }
            long st = 1;
            long sum = 0;
            for(int i = k.length()-1; i >= 0; i--){
                if(k.charAt(i) == '1'){
                    sum+=st;
                }
                st *= 2;
            }
            System.out.println(k + " " + sum);
        }
    }
}
