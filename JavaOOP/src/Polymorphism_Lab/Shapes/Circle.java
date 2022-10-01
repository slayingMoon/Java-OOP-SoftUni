package Polymorphism_Lab.Shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        setRadius(radius);
        calculatePerimeter();
        calculateArea();
    }

    public final Double getRadius() {
        return this.radius;
    }

    protected void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }

    @Override
    protected void calculateArea() {
        setArea(Math.PI * radius * radius);
    }
}
