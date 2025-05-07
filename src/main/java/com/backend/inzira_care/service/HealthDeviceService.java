package com.backend.inzira_care.service;

import com.backend.inzira_care.model.HealthDevice;

import java.util.List;

public interface HealthDeviceService {
    List<HealthDevice> getAllHealthDevices();
    HealthDevice getHealthDeviceById(Long id);
    HealthDevice saveHealthDevice(HealthDevice healthDevice);
    HealthDevice updateHealthDevice(Long id, HealthDevice healthDevice);
    void removeHealthDeviceById(Long id);
}
