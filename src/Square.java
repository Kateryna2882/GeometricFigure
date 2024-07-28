public class Square implements GeometricFigure {
    private double sideLength;


    public Square(double sideLength) {
        this.sideLength = sideLength;


    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}



