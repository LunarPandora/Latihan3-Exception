package com.mycompany.latihan3.exception;

public class FileNotFoundException extends Throwable {
    private String message;

    public FileNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "FileNotFoundError : " + message;
    }
}
