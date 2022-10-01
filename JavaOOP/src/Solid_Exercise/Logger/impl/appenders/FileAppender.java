package Solid_Exercise.Logger.impl.appenders;

import Solid_Exercise.Logger.enums.ReportLevel;
import Solid_Exercise.Logger.interfaces.File;
import Solid_Exercise.Logger.interfaces.Layout;

public class FileAppender extends BaseAppender {
    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }

    public FileAppender(Layout layout, String fileName) {
        this(layout);
        this.file = new LogFile(fileName);
    }

    @Override
    public void append(String time, ReportLevel reportLevel, String message) {
        if (canAppend(reportLevel)) {
            increaseMessagesCount();
            String formattedMessage = this.layout.format(time, reportLevel, message);
            file.append(formattedMessage);
        }
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", File size: %s", this.file.getSize());
    }
}
