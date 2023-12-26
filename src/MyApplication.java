import interfaces.Shape;
import models.Circle;
import models.Rectangle;
import models.Triangle;

import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        Shape c = new Circle(6);
        Shape r = new Rectangle(7, 9);
        Shape t = new Triangle(3, 4, 5);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c);
        shapes.add(r);
        shapes.add(t);

        printShapes(shapes);
    }

    public static void printShapes(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            printShape(shape);
        }
    }

    public static void printShape(Shape shape) {
        System.out.println(shape.toString());
        System.out.println("area: " + shape.area());
        System.out.println("perimeter: " + shape.perimeter());
        System.out.println("\n++++++++++++++++\n");
    }
}
