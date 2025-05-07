package com.backend.inzira_care.exception;

public class NotificationNotFoundException extends RuntimeException{
    public NotificationNotFoundException(Long id){
        super
                ("Couldn't find a Notification with id "+id);
    }
}
