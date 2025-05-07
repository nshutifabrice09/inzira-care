package com.backend.inzira_care.exception;

public class ElderlyPersonNotFoundException extends RuntimeException{
    public ElderlyPersonNotFoundException(Long id){
        super("Couldn't find an ElderlyPerson with id "+id);
    }
}
