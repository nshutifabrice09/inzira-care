package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "medical_schedules")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicalSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long elderlyPersonId;
    private String medicationName;
    private String dosage;
    private String frequency;
    private LocalDate startDate;
    private LocalDate endDate;
    private String instructions;
    private Long assignedByUserId;
}
