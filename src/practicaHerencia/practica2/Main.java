package practicaHerencia.practica2;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Perla", 7, "hembra", "cocker", "Negro");
        Elefante elefante1 = new Elefante("Jorge",12, "Macho", "Asiatico", 5000, 5.9);
        Caballo caballo1 = new Caballo("Luca", 18, "macho", "pura sangre", "establo", "Marron");

        perro1.comer();
        perro1.hacerSonido();

        elefante1.informacion();

        caballo1.galopar();
        caballo1.informacion();
        caballo1.hacerSonido();
    }

}