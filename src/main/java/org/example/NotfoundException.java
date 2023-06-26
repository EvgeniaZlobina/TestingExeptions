package org.example;

public class NotfoundException extends RuntimeException {
    public NotfoundException(int id) {
        super("Element with id " + id + " not found");
    }
}
