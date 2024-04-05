package Ejercitacion04_04.ejercicio1;

public class Circulo implements Figura, Dibujable, Rotable{
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    @Override
    public String dibujar() {
        return ("●");
    }

    @Override
    public String rotar() {
        return ("EL círculo se giró");
    }
}
