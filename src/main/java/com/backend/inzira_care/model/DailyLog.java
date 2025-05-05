package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "daily_logs")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long elderlyPersonId;
    private String summary;
    private Long loggedByUserId;
    private LocalDateTime loggedAt;
}
