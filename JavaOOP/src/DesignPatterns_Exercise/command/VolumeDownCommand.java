package DesignPatterns_Exercise.command;

public class VolumeDownCommand implements Command {
    Radio radio;

    public VolumeDownCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.volumeDown();
    }
}
