package DesignPatterns_Exercise.strategy.fly;

public class CantFly implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
