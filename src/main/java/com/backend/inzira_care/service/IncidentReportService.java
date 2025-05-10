package com.backend.inzira_care.service;

import com.backend.inzira_care.model.IncidentReport;

import java.util.List;

public interface IncidentReportService {
    List<IncidentReport> getAllIncidentReports();
    IncidentReport getIncidentReportById(Long id);
    IncidentReport saveIncidentReport(IncidentReport incidentReport);
    IncidentReport updateIncidentReport(Long id, IncidentReport incidentReport);
    void removeIncidentReportById(Long id);
}
