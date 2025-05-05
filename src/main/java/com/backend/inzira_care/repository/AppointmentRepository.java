package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository <Appointment, Long> {
}
