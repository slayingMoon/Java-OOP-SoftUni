package Polymorphism_Lab.Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        setHeight(height);
        setWidth(width);
        calculatePerimeter();
        calculateArea();
    }

    public Double getHeight() {
        return this.height;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(this.height * 2 + this.width * 2);
    }

    @Override
    protected void calculateArea() {
        setArea(this.height * this.width);
    }
}
