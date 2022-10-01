package Solid_Exercise.Logger.impl.appenders;

import Solid_Exercise.Logger.enums.ReportLevel;
import Solid_Exercise.Logger.interfaces.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, ReportLevel reportLevel, String message) {
        if (this.canAppend(reportLevel)) {
            super.increaseMessagesCount();
            String formattedMessage = this.layout.format(time, reportLevel, message);
            System.out.println(formattedMessage);
        }
    }
}
