package com.backend.inzira_care.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super
                ("Couldn't find a User with id "+id);
    }
}
