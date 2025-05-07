package com.backend.inzira_care.service;

import com.backend.inzira_care.model.AuditLog;

import java.util.List;

public interface AuditLogService {
    List<AuditLog> getAllAuditLogs();
    AuditLog getAuditLogById(Long id);
    AuditLog saveAuditLog(AuditLog auditLog);
    AuditLog updateAuditLog(Long id, AuditLog auditLog);
    void removeAuditLogById(Long id);
}
