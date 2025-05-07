package com.backend.inzira_care.exception;

public class AIAlertNotFoundException extends RuntimeException{
    public AIAlertNotFoundException (Long id){
        super("Couldn't find an AIAlert with id "+id);
    }
}
