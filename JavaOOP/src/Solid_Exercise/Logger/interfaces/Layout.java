package Solid_Exercise.Logger.interfaces;

import Solid_Exercise.Logger.enums.ReportLevel;

public interface Layout {
    String format(String time, ReportLevel reportLevel, String message);
}
