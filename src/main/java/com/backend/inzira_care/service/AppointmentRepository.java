package com.backend.inzira_care.service;

import com.backend.inzira_care.model.Appointment;

import java.util.List;

public interface AppointmentRepository {
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(Long id);
    Appointment saveAppointment(Appointment appointment);
    Appointment updateAppointment(Long id, Appointment appointment);
    void removeAppointmentById(Long id);
}
