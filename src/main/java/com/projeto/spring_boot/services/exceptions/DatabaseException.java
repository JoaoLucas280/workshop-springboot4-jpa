package com.projeto.spring_boot.services.exceptions;

public class DatabaseException extends RuntimeException{
    public DatabaseException(String message){
        super(message);
    }
}
