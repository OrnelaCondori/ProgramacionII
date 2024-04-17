package Ejercitacion16_04_Colecciones.ejercicioEquipos;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Equipo implements Iterable<Jugador> {
    private List<Jugador> jugadores;

    public Equipo(){
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    @Override
    public Iterator<Jugador> iterator(){
        return jugadores.iterator();
    }
}
