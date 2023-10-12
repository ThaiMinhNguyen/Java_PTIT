/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07071;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Ten> a = new ArrayList<>();
        while(t-->0){
            a.add(new Ten(sc.nextLine()));
        }
        Collections.sort(a);
//        for(Ten i : a){
//            System.out.println(i);
//        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String c = sc.nextLine();
            String[] k = c.split("\\.");
            for(Ten i : a){
                int check = 1;
                ArrayList<String> l = i.getS();
                if(l.size() != k.length){
                    continue;
                }
                for(int j = 0; j < l.size(); j++){
                    if(k[j].equals("*")){
                        continue;
                    }
                    if(!k[j].equals(l.get(j))){
                        check = 0;
                        break;
                    }
                }
                if(check == 1){
                    System.out.println(i);
                }
            }
           
        }
    }
}
