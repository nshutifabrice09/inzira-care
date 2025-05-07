package com.backend.inzira_care.exception;

public class VitalCheckNotFoundException extends RuntimeException{
    public VitalCheckNotFoundException(Long id){
        super
                ("Couldn't find a VitalCheck with id "+id);
    }
}
