package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class AuditLog {
    private Long id;
    private Long userId;
    private String action;
    private String entityAffected;
    private LocalDateTime timestamp;
}
