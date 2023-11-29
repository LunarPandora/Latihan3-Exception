package com.mycompany.latihan3.exception;

public class ProgramException extends Throwable {
    private String message;

    public ProgramException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "ProgramError : " + message;
    }
}
