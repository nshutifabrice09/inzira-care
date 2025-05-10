package com.backend.inzira_care.service;

import com.backend.inzira_care.model.Subscription;

import java.util.List;

public interface SubscriptionService {
    List<Subscription> getAllSubscriptions();
    Subscription getSubscriptionById(Long id);
    Subscription saveSubscription(Subscription subscription);
    Subscription updateSubscription(Long id, Subscription subscription);
    void removeSubscriptionById(Long id);
}
