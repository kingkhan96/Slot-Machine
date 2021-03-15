# Slot-Machine
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * have player name
 * then followed by having the game start
 * button is pressed in order to have a random number between 1 and 6 being generated for
 * the player.
 * 
 * */
package slotty;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arshad Khan
 */
public abstract class SlotMachine {

 public String name;
    public int jackpotCount;
    public int yourMoney;
    public int rollCount;
    
     public static final Scanner scanner = new Scanner(System.in);
     
     public SlotMachine(){
        super();
    }
     
     public void saveWinner() throws IOException {
         
         try {
            FileWriter fw = new FileWriter("SlotMachineRecords.txt", true); //saves the winning statistics only into this file
            PrintWriter pw = new PrintWriter(fw);

            System.out.println("\nName: " + name + "\nTotal prize money won: " + yourMoney + "\nTotal number of Jackpots: " + jackpotCount + "\nTotal lever pulls: " + rollCount + "\n");

            pw.println("\nName: " + name + ", Total prize money won: " + yourMoney + ", Total number of Jackpots: " + jackpotCount + ", Total lever pulls: " + rollCount + "\n");

            pw.close();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
     }
}
