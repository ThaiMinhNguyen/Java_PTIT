/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args){
        try{
            File newfile = new File("Hello.txt");
            Scanner myObj = new Scanner(newfile);
            while(myObj.hasNextLine()){
                String data = myObj.nextLine();
                System.out.println(data);
            }
            myObj.close();
        }
        catch(FileNotFoundException e){
                
        }
            
    }
}
