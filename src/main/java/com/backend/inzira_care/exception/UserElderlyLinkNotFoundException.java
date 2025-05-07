package com.backend.inzira_care.exception;

public class UserElderlyLinkNotFoundException extends RuntimeException{
    public UserElderlyLinkNotFoundException(Long id){
        super
                ("Couldn't find a UserElderlyLink with id "+id);
    }
}
