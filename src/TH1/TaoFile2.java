/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TaoFile2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        ArrayList<String> a1 = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            a1.add(sc.next());
        }
        ObjectOutputStream sc1 = new ObjectOutputStream(new FileOutputStream("DATA.in"));
        sc1.writeObject(a1);
    }
}
