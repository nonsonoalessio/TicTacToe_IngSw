package it.progettiS.exceptions;

public class MoveException extends RuntimeException {
    public MoveException(){}

    public MoveException(String msg){
        super(msg);
    }
}
