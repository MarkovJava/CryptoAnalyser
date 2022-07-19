package ru.javarush.cryptoanaliser.markov.application.controller.exeption;

public class IOApplicationException extends RuntimeException{

    public IOApplicationException() {
        super();
    }

    public IOApplicationException(String message) {
        super(message);
    }

    public IOApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public IOApplicationException(Throwable cause) {
        super(cause);
    }
}
