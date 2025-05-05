package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.DailyLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyLogRepository extends JpaRepository <DailyLog, Long> {
}
