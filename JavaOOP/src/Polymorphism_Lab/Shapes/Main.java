package Polymorphism_Lab.Shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(13D, 5D);
        Shape shape1 = new Circle(5D);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(shape);
        shapes.add(shape1);

        for (Shape s : shapes) {
            System.out.println(s.getPerimeter());
            System.out.println(s.getArea());
        }
    }
}
