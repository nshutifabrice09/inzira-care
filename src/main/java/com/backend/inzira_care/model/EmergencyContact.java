package com.backend.inzira_care.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emergency_contacts")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmergencyContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long elderlyPersonId;
    private String name;
    private String relationship;
    private String phone;
    private String email;
    private int priority;
}
