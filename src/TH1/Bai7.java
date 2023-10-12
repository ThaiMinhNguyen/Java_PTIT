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
import java.io.*;
import java.math.BigInteger;

public class Bai7 {
    public static void main(String[] args) throws IOException {
        BigInteger sum = new BigInteger("0");
        long res = 0;
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int k = Integer.parseInt(s);
                continue;
            } catch(Exception e) {
                try{
                    long l = Long.parseLong(s);
                    res += l;
                } catch (Exception w){
                    continue;
                }
            }
        }
        System.out.println(res);
    }
}
