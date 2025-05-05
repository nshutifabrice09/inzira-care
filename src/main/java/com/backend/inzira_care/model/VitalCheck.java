package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Table(name = "vital_checks")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VitalCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long elderlyPersonId;
    private String checkType;
    private String value;
    private String unit;
    private LocalDateTime checkedAt;
    private Long recordedByUserId;
}
