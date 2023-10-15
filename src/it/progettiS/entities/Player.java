package it.progettiS.entities;

public abstract class Player {
    public Player(){}
    protected char mark;
    public abstract Move makeMove(Board board);
}
