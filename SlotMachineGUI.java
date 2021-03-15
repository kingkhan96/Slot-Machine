/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotty;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author Admin
 * 
 */


//All the GUI code for the game is written underneath

public class SlotMachineGUI extends JPanel implements ActionListener{
    
    Connection conn = null;
    String url = "jdbc:derby:SlotMachine;create=true";  //url of the DB host
     String username = "14873076_14872601";  //your DB username
    String password = "SlotMachine";   //your DB password
    
        public void establishMySQLConnection()
    {
        try{
            conn=DriverManager.getConnection(url, username, password);
            System.out.println(url+"   connected...");
        }                                                                                //Here is the database
        catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    
    SlotMachine theGame;
    private JButton[][] buttons;
    private JPanel start = new JPanel();
    private JPanel board = new JPanel(); 
    private JButton Spin = new JButton("Spin");
    private JButton Add = new JButton("Add Player");
    private JButton Instructions = new JButton("Instructions");
   
    
    public SlotMachineGUI(){
        super(new BorderLayout());
       
        
        JPanel centerPanel = new JPanel(new GridLayout(10,10));
        centerPanel.setPreferredSize(new Dimension(700,600));

        add(centerPanel, BorderLayout.CENTER);
        
        Spin.addActionListener(this);
        Add.addActionListener(this);
        Instructions.addActionListener(this);
  
        JPanel southPanel = new JPanel();
        
        southPanel.add(this.Spin);
              southPanel.add(this.Instructions);
        southPanel.add(this.Add);
        add(southPanel,BorderLayout.SOUTH);
    }
    
    @Override
     public void actionPerformed(ActionEvent e) 
    {   
        if(e.getSource() == Add)
        {
            System.out.println("Add players"); 

            theGame = new AddPlayers();

            System.out.println("Adding");
        }
        else if(e.getSource()== Instructions){
              theGame = new Instructions();
            System.out.println("Provide instructions");
        }
        else if(e.getSource()== Spin){
            
            theGame = new PlayGame();
            System.out.println("Spinning");
        }
        else
        {   StringTokenizer tokenizer = new StringTokenizer(e.getActionCommand(), "[]");
            System.out.println("BUTTON WITH LABEL "+e.getActionCommand()+" PRESSED ");
           
        }
    }
     
     private class MouseListener extends MouseAdapter{
       
       @Override
       public void mousePressed(MouseEvent e){
           
           if(Add.isSelected()){
               theGame = new AddPlayers();
               System.out.println("Adding");
           }
           else if(Instructions.isSelected()){
               theGame = new Instructions();
               System.out.println("Here are the instructions");
           }

       }
       }
    
    public static void main(String[] args) {
      
        SlotMachineGUI GUI; 
        GUI = new SlotMachineGUI();
        JFrame frame = new JFrame("Slot Machine P31");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        JPanel main = new JPanel();
      main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
      frame.getContentPane().add(GUI);
      frame.pack();
      
        
       Toolkit tk = Toolkit.getDefaultToolkit();
       Dimension screenDimension = tk.getScreenSize();
       
        int screenHeight = screenDimension.height;
        int screenWidth = screenDimension.width;
        frame.setLocation(new Point((screenWidth/2) -  (frame.getWidth()/2),
                (screenHeight/2) - (frame.getHeight()/2)));

      frame.setVisible(true);
    }
    
}
    