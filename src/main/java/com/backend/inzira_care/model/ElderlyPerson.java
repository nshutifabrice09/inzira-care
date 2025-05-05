package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "elderly_persons")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ElderlyPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private LocalDate dob;
    private String gender;
    private String address;
    private String medicalConditions;
    private String photo;
    private Long primaryCaregiverId;
}
