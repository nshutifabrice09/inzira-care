package com.backend.inzira_care.service;

import com.backend.inzira_care.model.EmergencyContact;

import java.util.List;

public interface EmergencyContactService {
    List<EmergencyContact> getAllEmergencyContacts();
    EmergencyContact getEmergencyContactById(Long id);
    EmergencyContact saveEmergencyContact(EmergencyContact emergencyContact);
    EmergencyContact updateEmergencyContact(Long id, EmergencyContact emergencyContact);
    void removeEmergencyContactById(Long id);
}
