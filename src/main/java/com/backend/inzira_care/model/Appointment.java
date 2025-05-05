package com.backend.inzira_care.model;

import java.time.LocalDateTime;

public class Appointment {

    private Long id;
    private Long elderlyPersonId;
    private Long withUserId;
    private String appointmentType;
    private String location;
    private LocalDateTime dateTime;
    private String notes;
    private Long createdByUserId;
}
