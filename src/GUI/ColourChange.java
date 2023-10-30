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
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class ColourChange extends JFrame implements ActionListener, ItemListener{
    private JPanel p = new JPanel();
    private JButton ok = new JButton("OK");
    private JComboBox<String> chon = new JComboBox<>();
    public ColourChange(String title) throws HeadlessException{
        super(title);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        JPanel ps = new JPanel();
        ps.setLayout(new FlowLayout());
        ps.add(ok);
        chon.addItem("Xanh");
        chon.addItem("Đỏ");
        chon.addItem("Tím");
        chon.addItem("Vàng");
        ps.add(chon);
        chon.addItemListener(this);
        add(ps, BorderLayout.SOUTH);
        ok.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String colour = chon.getSelectedItem().toString();
        if(colour.equals("Xanh")) p.setBackground(Color.GREEN);
        else if(colour.equals("Đỏ")) p.setBackground(Color.RED);
        else if(colour.equals("Tím")) p.setBackground(Color.MAGENTA);
        else if(colour.equals("Vàng")) p.setBackground(Color.YELLOW);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String colour = chon.getSelectedItem().toString();
        if(colour.equals("Xanh")) p.setBackground(Color.GREEN);
        else if(colour.equals("Đỏ")) p.setBackground(Color.RED);
        else if(colour.equals("Tím")) p.setBackground(Color.MAGENTA);
        else if(colour.equals("Vàng")) p.setBackground(Color.YELLOW);    
    }
}
