package com.backend.inzira_care.exception;

public class SubscriptionNotFoundException extends RuntimeException{
    public SubscriptionNotFoundException(Long id){
        super
                ("Couldn't find a Subscription with id "+id);
    }
}
