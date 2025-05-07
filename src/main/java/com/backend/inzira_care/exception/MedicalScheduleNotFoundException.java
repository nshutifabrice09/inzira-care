package com.backend.inzira_care.exception;


public class MedicalScheduleNotFoundException extends RuntimeException{
    public MedicalScheduleNotFoundException(Long id){
        super
                ("Couldn't find a MedicalSchedule with id "+id);
    }
}
