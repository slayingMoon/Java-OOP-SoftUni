package Polymorphism_Exercise.WildFarm.animals;

import Polymorphism_Exercise.WildFarm.foods.Food;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    protected void setFoodEaten(Food food) {
        this.foodEaten = food.getQuantity();
    }

    protected String getAnimalName() {
        return this.animalName;
    }

    protected String getAnimalType() {
        return this.animalType;
    }

    protected Double getAnimalWeight() {
        return this.animalWeight;
    }

    protected Integer getFoodEaten() {
        return this.foodEaten;
    }

    public abstract void makeSound();
    public  abstract void eat(Food food);

}
