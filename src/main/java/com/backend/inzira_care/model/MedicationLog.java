package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "medication_logs")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long scheduleId;
    private Long takenByUserId;
    private LocalDateTime takenAt;
    private String notes;

}
