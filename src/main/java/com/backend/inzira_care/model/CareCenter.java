package com.backend.inzira_care.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "care_centers")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CareCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String type;
    private String contactInfo;
}
