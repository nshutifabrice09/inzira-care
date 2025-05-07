package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.HealthDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthDeviceRepository extends JpaRepository <HealthDevice, Long> {
}
