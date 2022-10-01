package Polymorphism_Exercise.WildFarm.animals;

import Polymorphism_Exercise.WildFarm.foods.Food;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(food);
    }

    @Override
    public String toString() {
        StringBuilder baseToString = new StringBuilder(super.toString());

        baseToString.insert(baseToString.indexOf(",") + 1, " " + this.breed + ",");

        return baseToString.toString();
    }
}
