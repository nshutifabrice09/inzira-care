package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class AIAlert {
    private Long id;
    private Long elderlyPersonId;
    private String alertType;
    private String description;
    private LocalDateTime triggeredAt;
    private boolean resolved;
}
