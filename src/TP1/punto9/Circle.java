package TP1.punto9;

public class Circle extends GeometricFigure{
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double Area() {
        return Math.PI * radio * radio;
    }
    @Override
    public double Perimeter() {
        return 2 * Math.PI * radio;
    }
}
