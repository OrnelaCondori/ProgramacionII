package Ejercitacion04_04.ejercicio1;

public class Cuadrado implements Figura, Dibujable, Rotable{
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado*lado;
    }

    @Override
    public String dibujar() {
        return ("⬛");
    }

    @Override
    public String rotar() {
        return ("El cuadrado se roto");
    }
}
