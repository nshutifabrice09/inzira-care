package com.backend.inzira_care.service;

import com.backend.inzira_care.model.EmergencyContact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergencyContactServiceImplementation implements EmergencyContactService{
    @Override
    public List<EmergencyContact> getAllEmergencyContacts() {
        return null;
    }

    @Override
    public EmergencyContact getEmergencyContactById(Long id) {
        return null;
    }

    @Override
    public EmergencyContact saveEmergencyContact(EmergencyContact emergencyContact) {
        return null;
    }

    @Override
    public EmergencyContact updateEmergencyContact(Long id, EmergencyContact emergencyContact) {
        return null;
    }

    @Override
    public void removeEmergencyContactById(Long id) {

    }
}
