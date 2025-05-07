package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.MedicalSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalScheduleRepository extends JpaRepository <MedicalSchedule, Long> {
}
