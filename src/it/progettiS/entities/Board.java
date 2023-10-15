package it.progettiS.entities;

import it.progettiS.exceptions.*;

public class Board {
    public Board(){
        this.cells = new char[3][3];
        for(char[] row : cells){
            for(char cell : row){
                cell = ' ';
            }
        }
    }
    private char[][] cells;

    public void cellSetter(int row, int col, char mark){
        this.cells[row][col] = mark;
    }

    public boolean isValidMove(Move m){
        return this.cells[m.getRow()][m.getCol()] == ' ';
    }
    public boolean makeMove(Move move, char mark) {
        if (isValidMove(move)){
            this.cells[move.getRow()][move.getCol()] = mark;
            return true;
        } else
            return false;
    }
    public boolean isFull(){
        for(char[] row : cells) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }
    public void print(){
        /* GRID COPY-PASTE
        +---+---+---+
        |   |   |   |
        +---+---+---+
        |     |   |   |
        +---+---+---+
        |   |   |   |
        +---+---+---+
        */
        String grid = "+---+---+---+\n" +
                "| " + this.cells[0][0] + " | " + this.cells[0][1] + " | " + this.cells[0][2] + " |\n" +
                "+---+---+---+\n" +
                "| " + this.cells[1][0] + " | " + this.cells[1][1] + " | " + this.cells[1][2] + " |\n" +
                "+---+---+---+\n" +
                "| " + this.cells[2][0] + " | " + this.cells[2][1] + " | " + this.cells[2][2] + " |\n";
        System.out.println(grid);
    }
    public boolean checkForWin(char mark, Move m){
        int colInd = m.getCol();
        int rowInd = m.getRow();
        int i;

        // check orizzontale
        for(i = 0; i < 3; i++) {
            if (this.cells[rowInd][i] != mark)
                break;
            if (i == 2 && this.cells[rowInd][i] == mark)
                return true;
        }

        // check verticale
        for(i = 0; i < 3; i++){
            if(this.cells[i][colInd] != mark)
                break;
            if (i == 2 && this.cells[i][colInd] == mark)
                return true;
        }

        // check diagonale 1
        // 00 - 11 - 22
        i = 0;
        int j = 0;
        while(i <= rowInd && j <= colInd){
            if(this.cells[i][j] != mark)
                break;
            if (this.cells[i][j] == mark && i == rowInd && j == colInd)
                return true;
            i++; j++;
        }
        // check diagonale 2
        // 20 - 11 - 02
        i = rowInd;
        j = 0;
        while(i >= 0 && j <= colInd){
            if(this.cells[i][j] != mark)
                break;
            if (this.cells[i][j] == mark && i == rowInd && j == colInd)
                return true;
            i--; j++;
        }

        return false;
    }
}
