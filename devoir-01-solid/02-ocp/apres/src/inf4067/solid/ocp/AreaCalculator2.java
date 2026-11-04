package inf4067.solid.ocp;

// Contrat commun aux formes.
interface Shape {
    double calculateArea();
}

// Chaque forme définit son propre calcul d'aire.
class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Le calculateur délègue le calcul à la forme reçue.
public class AreaCalculator2 {

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
