package inf4067.solid.ocp;

// Calculateur initial utilisant des conditions.
public class AreaCalculator {

    public double calculateArea(Object shape) {

        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;

            return rectangle.getWidth() * rectangle.getHeight();

        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;

            return Math.PI
                * circle.getRadius()
                * circle.getRadius();
        }

        throw new IllegalArgumentException("Unknown shape");
    }
}

// Représentation d'un rectangle.
class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

// Représentation d'un cercle.
class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
