package com.exam.examserver.exception;

public class UserFoundException extends Exception{

    public UserFoundException(){
        super("User with this username is already existed in DB,Try with other details !!");
    }
    public UserFoundException(String msg) {
        super(msg);
    }
}
