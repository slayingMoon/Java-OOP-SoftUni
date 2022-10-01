package DesignPatterns_Exercise.builder;

public class Pizza {

    public static class PizzaBuilder {
        private Pizza pizza;

        private PizzaBuilder() {
            pizza = new Pizza();
        }

        public static PizzaBuilder get() {
            return new PizzaBuilder();
        }

        public PizzaBuilder withName(String name) {
            this.pizza.setName(name);
            return this;
        }

        public PizzaBuilder withWeight(int weight) {
            this.pizza.setWeight(weight);
            return this;
        }

        public PizzaBuilder withDiameter(int diameter) {
            this.pizza.setDiameter(diameter);
            return this;
        }

        public PizzaBuilder withHot(boolean isHot) {
            this.pizza.setHot(isHot);
            return this;
        }

        public PizzaBuilder withMeat(boolean hasMeat) {
            this.pizza.setHasMeat(hasMeat);
            return this;
        }

        public PizzaBuilder withTomatoes(boolean containsTomatoes) {
            this.pizza.setContainsTomatoes(containsTomatoes);
            return this;
        }

        public Pizza build() {
            return pizza;
        }
    }

    private String name;

    private int weight;
    private int diameter;

    private boolean isHot;
    private boolean hasMeat;
    private boolean containsTomatoes;

    private Pizza() {
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    private void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    private void setHot(boolean hot) {
        isHot = hot;
    }

    private void setHasMeat(boolean hasMeat) {
        this.hasMeat = hasMeat;
    }

    private void setContainsTomatoes(boolean containsTomatoes) {
        this.containsTomatoes = containsTomatoes;
    }
}
