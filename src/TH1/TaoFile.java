/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

import java.io.ObjectOutputStream;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class TaoFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            a1.add(sc.next());
        }
        for(int i = 0; i < 10; i++){
            a2.add(sc.next());
        }
        ObjectOutputStream sc1 = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
        ObjectOutputStream sc2 = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        sc1.writeObject(a1);
        sc2.writeObject(a2);
    }
}
