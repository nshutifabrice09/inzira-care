package com.backend.inzira_care.service;

import com.backend.inzira_care.model.VitalCheck;

import java.util.List;

public interface VitalCheckService {
    List<VitalCheck> getAllVitalChecks();
    VitalCheck getVitalCheckById(Long id);
    VitalCheck saveVitalCheck(VitalCheck vitalCheck);
    VitalCheck updateVitalCheck(Long id, VitalCheck vitalCheck);
    void removeVitalCheckById(Long id);
}
