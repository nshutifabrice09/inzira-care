package com.backend.inzira_care.service;

import com.backend.inzira_care.model.MedicationLog;

import java.util.List;

public interface MedicationLogService {
    List<MedicationLog> getAllMedicationLogs();
    MedicationLog getMedicationLogById(Long id);
    MedicationLog saveMedicationLog(MedicationLog medicationLog);
    MedicationLog updateMedicationLog(Long id, MedicationLog medicationLog);
    void removeMedicalLogById(Long id);
}
