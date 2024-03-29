package DesignPatterns_Exercise.factory;

public class ItalianPizza extends Pizza {

    public ItalianPizza(double diameter) {
        super(diameter);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Italian pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Italian pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Italian pizza");
    }
}
