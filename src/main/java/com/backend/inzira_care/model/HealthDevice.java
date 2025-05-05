package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "healthy_devices")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HealthDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long elderlyPersonId;
    private String deviceType;
    private String deviceId;
    private LocalDateTime lastSync;
    private String status;
}
