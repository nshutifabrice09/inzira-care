package com.backend.inzira_care.service;

import com.backend.inzira_care.model.MedicalSchedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalScheduleServiceImplementation implements MedicalScheduleService{
    @Override
    public List<MedicalSchedule> getAllMedicalSchedules() {
        return null;
    }

    @Override
    public MedicalSchedule getMedicalScheduleById(Long id) {
        return null;
    }

    @Override
    public MedicalSchedule saveMedicalSchedule(MedicalSchedule medicalSchedule) {
        return null;
    }

    @Override
    public MedicalSchedule updateMedicalSchedule(Long id, MedicalSchedule medicalSchedule) {
        return null;
    }

    @Override
    public void removeMedicalScheduleById(Long id) {

    }
}
