/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_Gui;

import GUI.ColourChange;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class B1 extends JFrame implements ActionListener{
    private JPanel p = new JPanel();
    private JButton ok = new JButton("Choose color");
    public B1(String title) throws HeadlessException{
        super(title);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        JPanel ps = new JPanel();
        add(ok, BorderLayout.SOUTH);;
        ok.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color init = p.getBackground();
        Color choosen = JColorChooser.showDialog(null, "Selected", init);
        if(choosen != null){
            p.setBackground(choosen);
        }
    }
    
    public static void main(String[] args) {
        B1 x = new B1("Choose");
        x.setVisible(true);
        x.setSize(400, 500);
        x.setLocationRelativeTo(null);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);
    }
}
