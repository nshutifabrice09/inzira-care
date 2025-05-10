package com.backend.inzira_care.service;

import com.backend.inzira_care.model.MedicalSchedule;

import java.util.List;

public interface MedicalScheduleService {
    List<MedicalSchedule> getAllMedicalSchedules();
    MedicalSchedule getMedicalScheduleById(Long id);
    MedicalSchedule saveMedicalSchedule(MedicalSchedule medicalSchedule);
    MedicalSchedule updateMedicalSchedule(Long id, MedicalSchedule medicalSchedule);
    void removeMedicalScheduleById(Long id);
}
