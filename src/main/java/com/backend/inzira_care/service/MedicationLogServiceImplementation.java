package com.backend.inzira_care.service;

import com.backend.inzira_care.model.MedicationLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationLogServiceImplementation implements MedicationLogService{
    @Override
    public List<MedicationLog> getAllMedicationLogs() {
        return null;
    }

    @Override
    public MedicationLog getMedicationLogById(Long id) {
        return null;
    }

    @Override
    public MedicationLog saveMedicationLog(MedicationLog medicationLog) {
        return null;
    }

    @Override
    public MedicationLog updateMedicationLog(Long id, MedicationLog medicationLog) {
        return null;
    }

    @Override
    public void removeMedicalLogById(Long id) {

    }
}
