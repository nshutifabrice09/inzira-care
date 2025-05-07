package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.CareTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareTaskRepository extends JpaRepository <CareTask, Long> {
}
