package com.backend.inzira_care.repository;

import com.backend.inzira_care.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
