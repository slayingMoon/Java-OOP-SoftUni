package DesignPatterns_Exercise.strategy.fly;

public class FlyHigh implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Fly high");
    }
}
