package practicaHerencia.practica1;

public class Motocicleta extends Bicicleta{
    private double velocidad;
    private double cilindrada;

    public Motocicleta() {
    }

    public Motocicleta(double velocidad, double cilindrada) {
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Motocicleta(String tipo, double velocidad, double cilindrada) {
        super(tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Motocicleta(String color, int ruedas, String tipo, double velocidad, double cilindrada) {
        super(color, ruedas, tipo);
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
