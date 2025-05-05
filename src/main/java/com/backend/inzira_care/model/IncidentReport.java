package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "incident_reports")
@NoArgsConstructor
@AllArgsConstructor
public class IncidentReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long elderlyPersonId;
    private String description;
    private String severity;
    private LocalDateTime reportedAt;
    private Long reportedByUserId;
    private String actionTaken;
}
