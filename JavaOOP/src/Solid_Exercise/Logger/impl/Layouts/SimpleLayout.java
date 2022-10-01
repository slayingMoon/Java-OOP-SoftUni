package Solid_Exercise.Logger.impl.Layouts;

import Solid_Exercise.Logger.enums.ReportLevel;
import Solid_Exercise.Logger.interfaces.Layout;

public class SimpleLayout implements Layout {
    @Override
    public String format(String time, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s", time, reportLevel, message);
    }
}
