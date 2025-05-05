package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "ai_alerts")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AIAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long elderlyPersonId;
    private String alertType;
    private String description;
    private LocalDateTime triggeredAt;
    private boolean resolved;
}
