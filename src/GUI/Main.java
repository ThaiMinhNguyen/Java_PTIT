/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.*;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
//        Microwave x = new Microwave("Micro");
//        ColourChange x = new ColourChange("Colour");
        Calculator x = new Calculator("Cal");
        x.setSize(400, 500);
        x.setLocationRelativeTo(null);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);
        
    }
}
