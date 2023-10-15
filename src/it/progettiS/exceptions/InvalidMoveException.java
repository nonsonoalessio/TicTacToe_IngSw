package it.progettiS.exceptions;

public class InvalidMoveException extends MoveException {
    public InvalidMoveException(){}
    public InvalidMoveException(String msg){
        super(msg);
    }
}
