package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.EmergencyContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyContactRepository extends JpaRepository <EmergencyContact, Long> {
}
