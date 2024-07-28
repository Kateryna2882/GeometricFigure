public class Triangle implements GeometricFigure {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getArea() {
        return 0.5 * a * h;
    }
}

