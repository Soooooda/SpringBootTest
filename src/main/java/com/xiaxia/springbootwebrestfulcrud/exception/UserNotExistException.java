package com.xiaxia.springbootwebrestfulcrud.exception;

public class UserNotExistException extends RuntimeException{

    public UserNotExistException() {
        super("User not Exists");
    }
}
