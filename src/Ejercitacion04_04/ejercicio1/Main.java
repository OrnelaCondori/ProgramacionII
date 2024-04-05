package Ejercitacion04_04.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Cuadrado cua1 = new Cuadrado(3);
        Circulo cir1 = new Circulo(5);

        System.out.println(cua1.dibujar());
        System.out.println("area: "+cua1.area());
        System.out.println(cua1.rotar());

        System.out.println(cir1.dibujar());
        System.out.println("Area: "+cir1.area());
        System.out.println(cir1.rotar());

    }
}
