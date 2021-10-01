package main;

public class EmptyStackException extends Exception {
    public EmptyStackException(String empty) {
        super(empty);
    }
}
