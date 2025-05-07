package com.backend.inzira_care.service;

import com.backend.inzira_care.model.DailyLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyLogServiceImplementation implements DailyLogService{
    @Override
    public List<DailyLog> getAllDailyLogs() {
        return null;
    }

    @Override
    public DailyLog getDailyLogById(Long id) {
        return null;
    }

    @Override
    public DailyLog saveDailyLog(DailyLog dailyLog) {
        return null;
    }

    @Override
    public DailyLog updateDailyLog(Long id, DailyLog dailyLog) {
        return null;
    }

    @Override
    public void removeDailyLogById(Long id) {

    }
}
