package com.backend.inzira_care.exception;

public class AppointmentNotFoundException extends RuntimeException{
    public AppointmentNotFoundException(Long id){
        super("Couldn't find an Appointment with id "+id);
    }
}
