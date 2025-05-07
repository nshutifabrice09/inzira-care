package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.VitalCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitalCheckRepository extends JpaRepository <VitalCheck, Long> {
}
