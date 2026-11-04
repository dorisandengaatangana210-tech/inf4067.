package inf4067.solid.lsp;

public class Mainlsp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);

        System.out.println(
            "Aire du Rectangle = " + rectangle.getArea()
        );

        Rectangle rectangle1 = new Square();
        rectangle1.setWidth(5);
        rectangle1.setHeight(4);

        System.out.println(
            "Aire du Carré = " + rectangle1.getArea()
        );
    }
}
