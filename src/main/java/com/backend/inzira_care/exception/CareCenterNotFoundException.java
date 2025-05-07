package com.backend.inzira_care.exception;

public class CareCenterNotFoundException extends RuntimeException{
    public CareCenterNotFoundException(Long id){
        super("Couldn't find a CareCenter with id "+id);
    }
}
