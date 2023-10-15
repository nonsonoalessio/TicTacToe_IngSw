package it.progettiS.entities;

public abstract class Player {
    public Player(char mark){
        this.mark = mark;
    }
    protected char mark;
    public abstract Move makeMove(Board board);
}
