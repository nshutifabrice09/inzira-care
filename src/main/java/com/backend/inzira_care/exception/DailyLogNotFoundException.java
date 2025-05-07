package com.backend.inzira_care.exception;

public class DailyLogNotFoundException extends RuntimeException{
    public DailyLogNotFoundException(Long id){
        super("Couldn't find a DailyLog with id "+id);
    }
}
