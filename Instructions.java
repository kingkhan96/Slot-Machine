/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotty;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Arshad
 */
public class Instructions extends SlotMachine {

    private int compWidth=500;
    private int compHeight=300;
    
    JLabel label = new JLabel("Rule 1: enter your name.");
    JLabel label2 =new JLabel("Rule 2: Input an interger value to represent the money you wish to gamble.\n");
    JLabel label3 = new JLabel("Rule 3: Every spin will cost $2.");
    JLabel label4 =new JLabel("Rule 4: Press the spin button to play game.\n");
    JLabel label5 = new JLabel("Rule 5: You may press the quit button to exit anytime.");
    JLabel label6 =new JLabel("Rule 6: Your prize total increases everytime by 100 when you lose.\n");
    JLabel label7 = new JLabel("Rule 7: You cannot continue the game if you don't have enough funds to spin.");
    JLabel label8 =new JLabel("Rule 8: You can save you score when you quit (Only if you have won a jackpot). .\n");
    
    JFrame frame = new JFrame("Instructions");
    
       
          public static void main(String[] args)
    {
       Instructions i = new Instructions();
       
    }
    public Instructions(){
        
         Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int screenWidth=screenSize.width;
        int screenHeight=screenSize.height;
        
        int frameWidth=screenWidth/2;
        int frameHeight=screenHeight/2;
//        label.setLocation(100,10);
        frame.add(name, label);
         frame.add(name, label2);
          frame.add(name, label3);
           frame.add(name, label4);
            frame.add(name, label5);
             frame.add(name, label6);
              frame.add(name, label7);
               frame.add(name, label8);
       
        frame.setSize(frameWidth, frameHeight);
        frame.setLocation(300,100);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        label.setBounds(new Rectangle(new Point(10, 10), label.getPreferredSize()));
        label2.setBounds(new Rectangle(new Point(10, 30), label2.getPreferredSize()));
        label3.setBounds(new Rectangle(new Point(10, 50), label3.getPreferredSize()));
        label4.setBounds(new Rectangle(new Point(10, 70), label4.getPreferredSize()));
        label5.setBounds(new Rectangle(new Point(10, 90), label5.getPreferredSize()));
        label6.setBounds(new Rectangle(new Point(10, 110), label6.getPreferredSize()));
        label7.setBounds(new Rectangle(new Point(10, 130), label7.getPreferredSize()));
        label8.setBounds(new Rectangle(new Point(10, 150), label8.getPreferredSize()));

        
        frame.setVisible(true);
    }
}
