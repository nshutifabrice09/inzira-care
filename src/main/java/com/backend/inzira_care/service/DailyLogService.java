package com.backend.inzira_care.service;

import com.backend.inzira_care.model.DailyLog;

import java.util.List;

public interface DailyLogService {
    List<DailyLog> getAllDailyLogs();
    DailyLog getDailyLogById(Long id);
    DailyLog saveDailyLog(DailyLog dailyLog);
    DailyLog updateDailyLog(Long id, DailyLog dailyLog);
    void removeDailyLogById(Long id);
}
