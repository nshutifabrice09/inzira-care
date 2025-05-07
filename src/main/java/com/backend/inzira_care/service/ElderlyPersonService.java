package com.backend.inzira_care.service;

import com.backend.inzira_care.model.ElderlyPerson;

import java.util.List;

public interface ElderlyPersonService {
    List<ElderlyPerson> getAllElderlyPeople();
    ElderlyPerson getElderlyPersonById(Long id);
    ElderlyPerson saveElderlyPerson(ElderlyPerson elderlyPerson);
    ElderlyPerson updateElderlyPerson(Long id, ElderlyPerson elderlyPerson);
    void removeElderlyPersonById(Long id);
}
