package it.progettiS.entities;
import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(){}

    @Override
    public Move makeMove(Board board){
        Scanner userInputCol = new Scanner(System.in);
        Scanner userInputRow = new Scanner (System.in);
        System.out.println("Immetti riga: ");
        int row = userInputRow.nextInt();
        System.out.println("Immetti colonna: ");
        int col = userInputCol.nextInt();
        return new Move(row, col);
    }
}
