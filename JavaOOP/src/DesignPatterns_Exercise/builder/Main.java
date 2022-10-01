package DesignPatterns_Exercise.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.PizzaBuilder
                .get()
                .withWeight(200)
                .withName("Marinara")
                .withDiameter(20)
                .withHot(true)
                .withMeat(true)
                .withTomatoes(true)
                .build();

        System.out.println(pizza);
    }
}
