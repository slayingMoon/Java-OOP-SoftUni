package Solid_Exercise.Logger.impl;

import Solid_Exercise.Logger.enums.ReportLevel;
import Solid_Exercise.Logger.interfaces.Appender;
import Solid_Exercise.Logger.interfaces.Logger;

import java.util.Arrays;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    public MessageLogger(Appender... appenders) {
        this.appenders = appenders;
    }

    @Override
    public void logInfo(String time, String message) {
        log(time, ReportLevel.INFO, message);
    }

    @Override
    public void logWarning(String time, String message) {
        log(time, ReportLevel.WARNING, message);
    }

    @Override
    public void logError(String time, String message) {
        log(time, ReportLevel.ERROR, message);
    }

    @Override
    public void logCritical(String time, String message) {
        log(time, ReportLevel.CRITICAL, message);
    }

    @Override
    public void logFatal(String time, String message) {
        log(time, ReportLevel.FATAL, message);
    }

    private void log(String time, ReportLevel reportLevel, String message) {
        for (Appender appender : appenders) {
            appender.append(time, reportLevel, message);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Logger info");
        sb.append(System.lineSeparator());

        for (Appender appender : appenders) {
            sb.append(appender);
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}
