package practicaHerencia.practica1;

public class Camioneta extends Coche{
    private int carga;

    public Camioneta() {
    }

    public Camioneta(int carga) {
        this.carga = carga;
    }

    public Camioneta(float velocidad, double cilindrada, int carga) {
        super(velocidad, cilindrada);
        this.carga = carga;
    }

    public Camioneta(String color, int ruedas, float velocidad, double cilindrada, int carga) {
        super(color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
