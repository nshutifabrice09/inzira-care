package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class IncidentReport {
    private Long id;
    private Long elderlyPersonId;
    private String description;
    private String severity;
    private LocalDateTime reportedAt;
    private Long reportedByUserId;
    private String actionTaken;
}
