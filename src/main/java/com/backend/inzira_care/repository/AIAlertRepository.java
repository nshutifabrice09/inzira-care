package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.AIAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AIAlertRepository extends JpaRepository <AIAlert, Long> {
}
