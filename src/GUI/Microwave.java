/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author admin
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.*;
public class Microwave extends JFrame{
    public Microwave(String title) throws HeadlessException{
        super(title);
        setSize(400, 500);
        setLayout(new GridLayout(1, 2));
        add(new JButton("Food to be placed here"));
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        JTextField t = new JTextField("Time to be displayed here");
        p1.add(t, BorderLayout.NORTH);
        JPanel num = new JPanel();
        num.setLayout(new GridLayout(4, 3));
        for(int i = 1; i <= 9;i++){
            num.add(new JButton("" + i));
        }
        num.add(new JButton("0"));
        num.add(new JButton("Start"));
        num.add(new JButton("Stop"));
        p1.add(num, BorderLayout.CENTER);
        add(p1);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
