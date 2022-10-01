package DesignPatterns_Lab.prototype;

public class Music extends Item {
    private double duration;

    public Music(String name, String imgURL, double price) {
        super(name, imgURL, price);
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
