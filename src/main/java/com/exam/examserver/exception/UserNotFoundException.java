package com.exam.examserver.exception;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(){
        super("User with this username is not found in DB");
    }
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
