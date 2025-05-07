package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.IncidentReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentReportRepository extends JpaRepository <IncidentReport, Long> {
}
