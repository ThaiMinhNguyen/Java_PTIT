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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    public Calculator(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        JTextArea res = new JTextArea();
        res.setSize(100, 100);
        add(res, BorderLayout.NORTH);
        JPanel num = new JPanel();
        num.setLayout(new GridLayout(4, 4));
        num.add(new JButton("7"));
        num.add(new JButton("8"));
        num.add(new JButton("9"));
        num.add(new JButton("+"));
        num.add(new JButton("4"));
        num.add(new JButton("5"));
        num.add(new JButton("6"));
        num.add(new JButton("-"));
        num.add(new JButton("1"));
        num.add(new JButton("2"));
        num.add(new JButton("3"));
        num.add(new JButton("*"));
        num.add(new JButton("Delete"));
        num.add(new JButton("0"));
        num.add(new JButton("="));
        num.add(new JButton("*"));
        add(num, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
