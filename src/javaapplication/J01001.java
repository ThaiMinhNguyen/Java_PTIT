/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class J01001 {
    public static void main(String[] args){
        int dai, rong;
        Scanner sc = new Scanner(System.in);
        dai = sc.nextInt();
        rong = sc.nextInt();
        if(dai <= 0 || rong <= 0){
            System.out.println("0");
        }
        else{
            System.out.print((dai+rong)*2 + " " + dai*rong );
        }
    }
}
