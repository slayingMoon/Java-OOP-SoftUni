package DesignPatterns_Exercise.command;

public class VolumeUpCommand implements Command {
    Radio radio;

    public VolumeUpCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.volumeUp();
    }
}
