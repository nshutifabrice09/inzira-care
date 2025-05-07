package com.backend.inzira_care.service;

import com.backend.inzira_care.model.CareCenter;

import java.util.List;

public interface CareCenterService {
    List<CareCenter> getAllCareCenters();
    CareCenter getCareCenterById(Long id);
    CareCenter saveCareCenter(CareCenter careCenter);
    CareCenter updateCareCenter(Long id, CareCenter careCenter);
    void removeCareCenterById(Long id);
}
