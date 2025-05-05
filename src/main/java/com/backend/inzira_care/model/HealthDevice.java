package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class HealthDevice {
    private Long id;
    private Long elderlyPersonId;
    private String deviceType;
    private String deviceId;
    private LocalDateTime lastSync;
    private String status;
}
