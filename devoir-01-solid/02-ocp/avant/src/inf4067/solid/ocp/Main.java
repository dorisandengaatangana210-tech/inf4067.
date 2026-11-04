package inf4067.solid.ocp;

public class Main {

    public static void main(String[] args) {

        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(2);

        System.out.println(
            "Aire du rectangle : "
            + calculator.calculateArea(rectangle)
        );

        System.out.println(
            "Aire du cercle : "
            + calculator.calculateArea(circle)
        );
    }
}
