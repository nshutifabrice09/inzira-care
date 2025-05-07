package com.backend.inzira_care.exception;

public class HealthDeviceNotFoundException extends RuntimeException{
    public HealthDeviceNotFoundException(Long id){
        super("Couldn't find a HealthDevice with id "+id);
    }
}
