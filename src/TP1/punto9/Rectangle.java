package TP1.punto9;

public class Rectangle extends GeometricFigure {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double Area() {
        return height*width;
    }
    @Override
    public double Perimeter() {
        return 2*height+2*width;
    }
}
