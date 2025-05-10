package com.backend.inzira_care.service;

import com.backend.inzira_care.model.UserElderlyLink;

import java.util.List;

public interface UserElderlyLinkService {
    List<UserElderlyLink> getAllUserElderlyLinks();
    UserElderlyLink getUserElderlyLinkById(Long id);
    UserElderlyLink saveUserElderlyLink(UserElderlyLink userElderlyLink);
    UserElderlyLink updateUserElderlyLink(Long id, UserElderlyLink userElderlyLink);
    void removeById(Long id);
}
