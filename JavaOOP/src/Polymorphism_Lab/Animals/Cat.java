package Polymorphism_Lab.Animals;

public class Cat extends Animal{
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    protected String explainSelf() {
        return String.format("I am %s and my favourite food is %s", getName(), getFavouriteFood()) +
                System.lineSeparator() +
                "MEOW";
    }
}
