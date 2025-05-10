package com.backend.inzira_care.service;

import com.backend.inzira_care.model.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> getAllNotifications();
    Notification getNotificationById(Long id);
    Notification saveNotification(Notification notification);
    Notification updateNotification(Long id, Notification notification);
    void removeNotificationById(Long id);
}
