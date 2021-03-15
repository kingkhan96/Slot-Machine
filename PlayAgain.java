/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotty;

/**
 *
 * @author Admin
 */
public class PlayAgain extends SlotMachine{
    
    private PlayGame play;
    private AddPlayers adding;
    
    public void playAgain() {

        String yeahNah;
        boolean next = false;

        while (!next) {

            System.out.println("Do you wish to play again(Y/N): ");
            yeahNah = scanner.nextLine();
            if (yeahNah.matches("[Y]+")) {

                next = true;
                
                boolean game = true;
                while(!game){
                
                
                adding = new AddPlayers();                       //Here the game is reset for another two players and played again.
               
                play = new PlayGame(); 
                game = false;
                }
                

            } else if (yeahNah.matches("[N]+")) {

                next = true;
                System.out.println("GameOver!!! Till next time goodbye!");
            }

        }

    }
    
}
