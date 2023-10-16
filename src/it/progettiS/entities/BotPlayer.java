package it.progettiS.entities;

public class BotPlayer extends Player {
    public BotPlayer(char mark){
        super(mark);
    }

    private Move m;

    @Override
    public Move makeMove(Board board){
        if(winningMoveAvailable(board, this.mark))
            return m;
        if(blockingMoveAvailable(board, this.mark))
            return m;
        if(strategicMoveAvailable(board, this.mark))
            return m;
        else return randomMove(board, mark);
    }


    private boolean winningMoveAvailable(Board b, char mark){
        // check orizzontale
        // check verticale
        // check diagonale
    }
    private boolean blockingMoveAvailable(Board b, char mark){
        // check orizzontale
        // check verticale
        // check diagonale
    }
    private boolean strategicMoveAvailable(Board b, char mark){}
    private Move randomMove(Board b, char mark){}
}
