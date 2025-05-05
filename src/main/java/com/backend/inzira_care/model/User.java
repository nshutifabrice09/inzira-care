package com.backend.inzira_care.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class User {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String profileImage;
    private boolean status;
}
