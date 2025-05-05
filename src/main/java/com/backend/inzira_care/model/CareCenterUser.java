package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "care_center_users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CareCenterUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long userId;
    private Long careCenterId;
    private String role;
    private String status;
}

