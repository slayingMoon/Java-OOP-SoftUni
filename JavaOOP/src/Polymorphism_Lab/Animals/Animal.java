package Polymorphism_Lab.Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.setName(name);
        this.setFavouriteFood(favouriteFood);
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    //to keep the method abstract
    protected String getName() {
        return this.name;
    }

    protected String getFavouriteFood() {
        return this.favouriteFood;
    }

    protected abstract String explainSelf();

    //solution without abstract Method
//    protected String explainSelf() {
//        return String.format("I am %s and my favourite food is %s", name, favouriteFood);
//    }
}
