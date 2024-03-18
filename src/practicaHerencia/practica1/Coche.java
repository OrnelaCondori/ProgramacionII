package practicaHerencia.practica1;

public class Coche extends Vehiculo{
    private double velocidad;
    private double cilindrada;

    public Coche() {
    }
    public Coche(float velocidad, double cilindrada) {
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }
    public Coche(String color, int ruedas, float velocidad, double cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
