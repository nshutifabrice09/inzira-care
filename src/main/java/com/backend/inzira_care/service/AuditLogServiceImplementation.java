package com.backend.inzira_care.service;

import com.backend.inzira_care.model.AuditLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImplementation implements AuditLogService {
    @Override
    public List<AuditLog> getAllAuditLogs() {
        return null;
    }

    @Override
    public AuditLog getAuditLogById(Long id) {
        return null;
    }

    @Override
    public AuditLog saveAuditLog(AuditLog auditLog) {
        return null;
    }

    @Override
    public AuditLog updateAuditLog(Long id, AuditLog auditLog) {
        return null;
    }

    @Override
    public void removeAuditLogById(Long id) {

    }
}
