package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_elderly_link")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserElderlyLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long elderlyPersonId;
    private String relationship;
    private String permissions;
}
