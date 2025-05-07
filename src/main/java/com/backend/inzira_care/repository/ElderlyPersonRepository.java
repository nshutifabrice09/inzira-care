package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.ElderlyPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElderlyPersonRepository extends JpaRepository <ElderlyPerson, Long> {
}
