package com.backend.inzira_care.service;

import com.backend.inzira_care.model.CareCenter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareCenterServiceImplementation implements CareCenterService{
    @Override
    public List<CareCenter> getAllCareCenters() {
        return null;
    }

    @Override
    public CareCenter getCareCenterById(Long id) {
        return null;
    }

    @Override
    public CareCenter saveCareCenter(CareCenter careCenter) {
        return null;
    }

    @Override
    public CareCenter updateCareCenter(Long id, CareCenter careCenter) {
        return null;
    }

    @Override
    public void removeCareCenterById(Long id) {

    }
}
