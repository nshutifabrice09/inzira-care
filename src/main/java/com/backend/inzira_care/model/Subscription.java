package com.backend.inzira_care.model;

import java.time.LocalDate;

public class Subscription {
    private Long id;
    private Long userId;
    private Long careCenterId;
    private String plan;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isActive;
    private String paymentStatus;
}
