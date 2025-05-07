package com.backend.inzira_care.exception;

public class CareTaskNotFoundException extends RuntimeException{
    public CareTaskNotFoundException(Long id){
        super("Couldn't find a CareTask with id "+id);
    }
}
