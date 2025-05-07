package com.backend.inzira_care.service;

import com.backend.inzira_care.model.AIAlert;

import java.util.List;

public interface AIAlertService {
    List<AIAlert> getAllAiAlerts();
    AIAlert getAiAlertById(Long id);
    AIAlert saveAiAlert(AIAlert aiAlert);
    AIAlert updateAiAlert(Long id, AIAlert aiAlert);
    void deleteById(Long id);
}
