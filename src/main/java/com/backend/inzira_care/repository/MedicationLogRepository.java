package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.MedicationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationLogRepository extends JpaRepository <MedicationLog, Long> {
}
