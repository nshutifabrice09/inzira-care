package com.backend.inzira_care.service;

import com.backend.inzira_care.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    User updateUser(Long id, User user);
    void removeUserById (Long id);
}
