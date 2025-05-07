package com.backend.inzira_care.exception;

public class CareCenterNotFoundExcpetion extends RuntimeException{
    public CareCenterNotFoundExcpetion(Long id){
        super("Couldn't find a CareCenter with id "+id);
    }
}
