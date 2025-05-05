package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class Notification {

    private Long id;
    private Long userId;
    private String message;
    private String type;
    private LocalDateTime createdAt;
    private LocalDateTime readAt;
}
