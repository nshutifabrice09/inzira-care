package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.UserElderlyLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserElderlyLinkRepository extends JpaRepository <UserElderlyLink, Long> {
}
