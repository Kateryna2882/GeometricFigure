public class Circle implements GeometricFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }
}
