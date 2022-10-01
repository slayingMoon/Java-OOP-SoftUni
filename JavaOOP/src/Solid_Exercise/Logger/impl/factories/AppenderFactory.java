package Solid_Exercise.Logger.impl.factories;

import Solid_Exercise.Logger.enums.ReportLevel;
import Solid_Exercise.Logger.impl.appenders.ConsoleAppender;
import Solid_Exercise.Logger.impl.appenders.FileAppender;
import Solid_Exercise.Logger.interfaces.Appender;
import Solid_Exercise.Logger.interfaces.Factory;
import Solid_Exercise.Logger.interfaces.Layout;

public class AppenderFactory implements Factory<Appender> {

    private LayoutFactory layoutFactory;

    public AppenderFactory() {
        this.layoutFactory = new LayoutFactory();

    }

    @Override
    public Appender produce(String input) {
        String[] tokens = input.split(" ");

        String appenderType = tokens[0];
        String layoutType = tokens[1];

        Layout layout = layoutFactory.produce(layoutType);
        Appender appender = null;

        if (appenderType.equals("ConsoleAppender")) {
            appender = new ConsoleAppender(layout);
        }else if (appenderType.equals("FileAppender")) {
            appender = new FileAppender(layout);
        }

        if (tokens.length >= 3) {
            appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
        }

        return appender;
    }
}
