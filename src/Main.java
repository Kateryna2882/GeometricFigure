import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] shapes = new GeometricFigure[]{
                new Circle(10.25),
                new Triangle(6.33,8.22),
                new Square(3.69)
        };

        double totalArea = 0;
        for (GeometricFigure shape : shapes) {
            totalArea += shape.getArea();

        }

        System.out.println("Total area of all shapes: " + totalArea);

    }
}