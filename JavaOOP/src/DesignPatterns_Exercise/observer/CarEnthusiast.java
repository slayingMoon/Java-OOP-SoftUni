package DesignPatterns_Exercise.observer;

public class CarEnthusiast implements Observer{
    @Override
    public void update(String magazineName) {
        System.out.println("YESS, my magazine is out " + magazineName);
    }
}
