package TP1.punto9;

public class Main {
    public static void main(String[] args){
        Circle circulo = new Circle(5);
        System.out.println("Área del círculo: " + circulo.Area());
        System.out.println("Perímetro del círculo: " + circulo.Perimeter());

        // Crear una instancia de un rectángulo
        Rectangle rectangulo = new Rectangle(4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.Area());
        System.out.println("Perímetro del rectángulo: " + rectangulo.Perimeter());
    }
}
