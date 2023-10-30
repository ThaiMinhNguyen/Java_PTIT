/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = Integer.parseInt(sc.nextLine());
        BigInteger sum = new BigInteger("0");
        List<BigInteger> s = new ArrayList<>();
        while(t-->0){
            BigInteger a = new BigInteger(sc.nextLine());
            sum = sum.add(a);
            s.add(a);
        }
        Collections.sort(s);
        System.out.println(s.get(0));
        System.out.println(s.get(s.size()-1));
        System.out.println(sum);
    }
}
