/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotty;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PlayGame extends SlotMachine {
    
    static public int rollCount;
    static public int jackpotCount;
    static public int num1;
    static public int num2;
    static public int num3;
    public static int yourMoney;        //The amount of money that a player enters to play with.
    public static int playable = 2;     //The amount of money decreased each game from the players account.

    public void Roll() {
        Random rand = new Random();

        num1 = rand.nextInt(6) + 1;
        num2 = rand.nextInt(6) + 1;
        num3 = rand.nextInt(6) + 1;

        System.out.println("\nRolling numbers...\n");
        System.out.println("[" + num1 + "] [" + num2 + "] [" + num3 + "]");

    }

    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        PlayGame playGame = new PlayGame();
 
        String userInput;

        System.out.println("Enter an amount of money: ");
        yourMoney = scan.nextInt();

        while (yourMoney >= playable) {

            System.out.println("Press 'P' to PLAY or 'Q' to QUIT");
            userInput = scan.next();

            if (userInput.toUpperCase().equals("P")) {
                yourMoney = yourMoney - playable;

                if (yourMoney >= playable) {
                    playGame.Roll(); //starts the game
                    
                    rollCount++;        //Counts number lever pulls.

                } else if (yourMoney < playable) //checks for loss
                {
                    System.out.println("Sorry, you have no money to play!");

                    break;
                }
            } else if (userInput.toUpperCase().equals("Q")) //accepts any letter case
            {

                break;
            } else {

                System.out.println("Invalid Input!");
                System.out.println("Press 'P' to PLAY or 'Q' to QUIT");
            }

        }

        //Prints out the stats after the game is completed
        System.out.println("Number of Jackpots: " + jackpotCount);
        System.out.println("Total lever pulls: " + rollCount);

        //Requests winner to save to File
        int saveScore;
//        if (yourMoney >= money) {
//
//            System.out.println("\nDo you wish to save your winning's on the system?\n Press (1) Yes\nPress (2) No");
//            saveScore = scan.nextInt();
//
//            if (saveScore == 1) {
//                SaveFile file = new SaveFile();
//                file.recordScores();
//            } else if (saveScore == 2) {
//                System.out.println("Thanks for playing better luck next time!");
//            } else {
//                System.out.println("Invalid input!");
//                System.out.println("\nDo you wish to save your winning's on the system?\n Press (1) Yes\nPress (2) No");
//            }
//        } else {
//
//            System.out.println("Thanks for playing the game! Sorry you didn't win try again later!");
//        }
//
    }
    
}
