package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class DailyLog {
    private Long id;
    private Long elderlyPersonId;
    private String summary;
    private Long loggedByUserId;
    private LocalDateTime loggedAt;
}
