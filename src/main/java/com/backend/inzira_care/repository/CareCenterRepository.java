package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.CareCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareCenterRepository extends JpaRepository <CareCenter, Long> {
}
