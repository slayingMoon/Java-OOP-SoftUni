package Polymorphism_Exercise.WildFarm.animals;

import Polymorphism_Exercise.WildFarm.foods.Food;
import Polymorphism_Exercise.WildFarm.foods.Vegetable;

public class Mouse extends Mammal{
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Vegetable)) {
            super.setFoodEaten(new Vegetable(0));
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }

        super.setFoodEaten(food);
    }
}
