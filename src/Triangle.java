public class Triangle implements GeometricFigure {
    private double a;
    private double h;
    @Override
    public double getAreaTriangle() {
        return 1/2*a*h;
    }
}

