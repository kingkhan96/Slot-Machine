/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotty;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddPlayers extends SlotMachine{


    String name;

    public AddPlayers(){
        super();
        
         final JFrame frame = new JFrame("Enter Players names...");
 
        JLabel Name = new JLabel("Player name:");
        JTextField p = new JTextField(20);
        Name.setLabelFor(p);
        
        JLabel yourmoney = new JLabel("Your Money ($2-$100):");
        JTextField moneyValue = new JTextField(20);
            
          yourmoney.setLabelFor(moneyValue);
        
        
        JButton submit = new JButton("Submit");
        submit.addActionListener(new AddButton(p));
        submit.addKeyListener(new AddButton(p));
        submit.addActionListener(new Adding(moneyValue));
        submit.addKeyListener(new Adding(moneyValue));

 
        JPanel panel = new JPanel();
 
        panel.add(Name);
        panel.add(p);
        panel.add(moneyValue);
        panel.add(yourmoney);
        panel.add(submit);
 
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        
        
    }

    public static void main(String[] args) {

    }


}
