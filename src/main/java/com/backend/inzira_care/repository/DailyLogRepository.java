package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.DailyLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyLogRepository extends JpaRepository <DailyLog, Long> {
}
