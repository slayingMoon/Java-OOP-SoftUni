package Solid_Exercise.Logger.impl.appenders;

import Solid_Exercise.Logger.enums.ReportLevel;
import Solid_Exercise.Logger.interfaces.Appender;
import Solid_Exercise.Logger.interfaces.Layout;

public abstract class BaseAppender implements Appender {
    private static final ReportLevel DEFAULT_REPORT_LEVEL = ReportLevel.INFO;

    Layout layout;
    private ReportLevel reportLevel;
    private int messagesCount;

    public BaseAppender(Layout layout) {
        this(layout, DEFAULT_REPORT_LEVEL);
    }

    public BaseAppender(Layout layout, ReportLevel reportLevel) {
        this.layout = layout;
        this.reportLevel = reportLevel;
        this.messagesCount = 0;
    }

    protected boolean canAppend(ReportLevel reportLevel) {
        return this.reportLevel.ordinal() <= reportLevel.ordinal();
    }

    protected void increaseMessagesCount() {
        this.messagesCount++;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",
                this.getClass().getSimpleName(),
                this.layout.getClass().getSimpleName(),
                this.reportLevel,
                this.messagesCount);
    }
}
