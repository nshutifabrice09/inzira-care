package com.backend.inzira_care.exception;

public class IncidentReportNotFoundException extends RuntimeException{
    public IncidentReportNotFoundException(Long id){
        super("Couldn't find an IncidentReport with id "+id);

    }
}
