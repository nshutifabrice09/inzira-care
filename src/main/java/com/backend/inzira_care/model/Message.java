package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class Message {
    private Long id;
    private Long senderId;
    private Long receiverId;
    private String content;
    private LocalDateTime timestamp;
    private boolean readStatus;
}
