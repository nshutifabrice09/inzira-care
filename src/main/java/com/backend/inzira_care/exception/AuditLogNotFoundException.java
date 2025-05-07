package com.backend.inzira_care.exception;

import com.backend.inzira_care.model.AuditLog;

public class AuditLogNotFoundException extends RuntimeException{
    public AuditLogNotFoundException(Long id){
        super ("Couldn't find an AuditLog with id "+id);
    }
}
