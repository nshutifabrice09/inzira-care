package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.EmergencyContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergencyContactRepository extends JpaRepository <EmergencyContact, Long> {
}
