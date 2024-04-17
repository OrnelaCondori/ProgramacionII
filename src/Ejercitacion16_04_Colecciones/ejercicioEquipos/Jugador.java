package Ejercitacion16_04_Colecciones.ejercicioEquipos;

public class Jugador {
    private String name;
    private String position;
    private int numCamiseta;

    public Jugador() {
    }

    public Jugador(String name, String position, int numCamiseta) {
        this.name = name;
        this.position = position;
        this.numCamiseta = numCamiseta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }
}
