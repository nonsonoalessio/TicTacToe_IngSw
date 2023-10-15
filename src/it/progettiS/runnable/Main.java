package it.progettiS.runnable;

import it.progettiS.entities.*;
import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class Main {
    public static void main(String args[]){
        System.out.println("Benvenuto in TicTacToe!\n");
        HumanPlayer playerX_h, playerO_h;
        BotPlayer playerX_b, playerO_b;
        Player x, o;

        System.out.println("Il giocatore X è umano? (yes/no)");
        Scanner choicexPlayer = new Scanner(System.in);
        String temp = choicexPlayer.nextLine();
        if (!temp.equals("yes") && !temp.equals("no")) {
            System.out.println("Scelta non valida!\n");
            return;
        }
        else{
            if(temp.equals("yes")){
               playerX_h = new HumanPlayer('x');
               playerX_b = null;
               x = playerX_h;
            } else {
                playerX_b = new BotPlayer('x');
                playerX_h = null;
                x = playerX_b;
            }
        }

        System.out.println("Il giocatore O è umano? (yes/no)");
        Scanner choiceoPlayer = new Scanner(System.in);
        temp = choiceoPlayer.nextLine();
        temp = choiceoPlayer.nextLine();
        if (!temp.equals("yes") && !temp.equals("no")) {
            System.out.println("Scelta non valida!\n");
            return;
        }
        else{
            if(temp.equals("yes")){
                playerO_h = new HumanPlayer('o');
                playerO_b = null;
                o = playerO_h;
            } else {
                playerO_b = new BotPlayer('o');
                playerO_h = null;
                o = playerO_b;
            }
        }

        System.out.println("Giochiamo!\n");

        Game g = new Game(x, o);
        g.play();

        Scanner playAgainScanner = new Scanner(System.in);
        String playAgainChoice = playAgainScanner.nextLine();
        while(playAgainChoice.equals("yes")){
            g = new Game(x, o);
            g.play();
            playAgainChoice = playAgainScanner.nextLine();
        }
    }
}
