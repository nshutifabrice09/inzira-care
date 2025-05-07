package com.backend.inzira_care.exception;

public class MedicationLogNotFoundException extends RuntimeException{
    public MedicationLogNotFoundException(Long id){
        super
                ("Couldn't find a MedicationLog with id "+id);
    }
}
