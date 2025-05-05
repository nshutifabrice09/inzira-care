package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class CareTask {

    private Long id;
    private Long elderlyPersonId;
    private String title;
    private String description;
    private Long assignedToUserId;
    private String status;
    private LocalDateTime dueDate;
    private LocalDateTime completedAt;
    private String priority;
}
