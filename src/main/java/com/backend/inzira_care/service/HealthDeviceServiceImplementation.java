package com.backend.inzira_care.service;

import com.backend.inzira_care.model.HealthDevice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthDeviceServiceImplementation implements HealthDeviceService{
    @Override
    public List<HealthDevice> getAllHealthDevices() {
        return null;
    }

    @Override
    public HealthDevice getHealthDeviceById(Long id) {
        return null;
    }

    @Override
    public HealthDevice saveHealthDevice(HealthDevice healthDevice) {
        return null;
    }

    @Override
    public HealthDevice updateHealthDevice(Long id, HealthDevice healthDevice) {
        return null;
    }

    @Override
    public void removeHealthDeviceById(Long id) {

    }
}
