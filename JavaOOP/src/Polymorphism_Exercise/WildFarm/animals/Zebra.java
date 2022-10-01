package Polymorphism_Exercise.WildFarm.animals;

import Polymorphism_Exercise.WildFarm.foods.Food;
import Polymorphism_Exercise.WildFarm.foods.Vegetable;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Vegetable)) {
            super.setFoodEaten(new Vegetable(0));
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }

        super.setFoodEaten(food);
    }
}
