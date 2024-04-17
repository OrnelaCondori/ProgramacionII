package Ejercitacion16_04_Colecciones.ejercicioEquipos;

public class Main {
    public static void main(String[] args){
        Equipo equipo = new Equipo();
        equipo.agregarJugador(new Jugador("Juan", "Delantero", 9));
        equipo.agregarJugador(new Jugador("Mario", "defensa", 13));
        equipo.agregarJugador(new Jugador("Lucas", "mediocampo", 8));
        equipo.agregarJugador(new Jugador("Pablo", "Delantero", 11));

        for (Jugador jugador : equipo){
            System.out.println("Nombre: "+jugador.getName()+ " --- Posicion: "+jugador.getPosition()+" --- Número: "+ jugador.getNumCamiseta());
        }
    }
}
