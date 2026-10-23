package com.br.appspring.exception;

public class ExceptionUser extends RuntimeException {
    public ExceptionUser() {
        super("User not found");
    }
}
