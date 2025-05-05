package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class VitalCheck {
    private Long id;
    private Long elderlyPersonId;
    private String checkType;
    private String value;
    private String unit;
    private LocalDateTime checkedAt;
    private Long recordedByUserId;
}
