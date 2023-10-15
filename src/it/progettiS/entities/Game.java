package it.progettiS.entities;

public class Game {
    public Game(Player x, Player o){
        this.currentPlayer = x;
        this.inactivePlayer = o;
    }
    private Player currentPlayer;
    private Player inactivePlayer;

    public void play(Board b){
        boolean won = false;
        while(!won && !b.isFull()){
            Move m = currentPlayer.makeMove(b);
            while(!b.isValidMove(m))
                m = currentPlayer.makeMove(b);
            b.print();
            if(b.checkForWin(currentPlayer.mark, m)) {
                System.out.println("Giocatore " + currentPlayer.mark + " ha vinto!\n");
                won = true;
            } else {
                Player hold = currentPlayer;
                currentPlayer = inactivePlayer;
                inactivePlayer = hold;
            }
            if (b.isFull()){
                System.out.println("La scacchiera è piena! Patta!\n");
            }
        }
    }
}
