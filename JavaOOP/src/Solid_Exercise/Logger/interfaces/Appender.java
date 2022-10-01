package Solid_Exercise.Logger.interfaces;

import Solid_Exercise.Logger.enums.ReportLevel;

public interface Appender {
    void append(String time, ReportLevel reportLevel, String message);
    void setReportLevel(ReportLevel reportLevel);
}
