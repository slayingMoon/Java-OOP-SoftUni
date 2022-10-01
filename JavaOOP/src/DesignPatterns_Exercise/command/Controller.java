package DesignPatterns_Exercise.command;

public class Controller {
    Command command;

    public void executeCommand(Command command) {
        this.command = command;
        command.execute();
    }
}
