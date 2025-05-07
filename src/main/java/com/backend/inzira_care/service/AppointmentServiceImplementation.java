package com.backend.inzira_care.service;

import com.backend.inzira_care.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImplementation implements AppointmentService{
    @Override
    public List<Appointment> getAllAppointments() {
        return null;
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return null;
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return null;
    }

    @Override
    public Appointment updateAppointment(Long id, Appointment appointment) {
        return null;
    }

    @Override
    public void removeAppointmentById(Long id) {

    }
}
