package com.stackroute.exception;

public class UserAlreadyExitsException extends Exception {
    private String message;

    public  UserAlreadyExitsException() {}

    public  UserAlreadyExitsException(String message) {
        super(message);
        this.message=message;
    }
}
