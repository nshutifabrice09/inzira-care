package com.backend.inzira_care.exception;

public class EmergencyContactNotFoundException extends RuntimeException{
    public EmergencyContactNotFoundException(Long id){
        super("Couldn't find an EmergencyContact with id "+id);
    }
}
