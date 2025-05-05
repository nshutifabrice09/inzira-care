package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.CareTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareTaskRepository extends JpaRepository <CareTask, Long> {
}
