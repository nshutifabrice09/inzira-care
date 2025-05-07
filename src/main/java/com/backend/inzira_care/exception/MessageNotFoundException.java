package com.backend.inzira_care.exception;

public class MessageNotFoundException extends RuntimeException{
    public MessageNotFoundException(Long id){
        super
                ("Couldn't find a Message with id "+id);
    }
}
