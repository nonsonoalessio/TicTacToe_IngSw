package it.progettiS.entities;

public class Move {
    public Move(int row, int col){
        this.col = col;
        this.row = row;
    }

    private int col;
    private int row;

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
