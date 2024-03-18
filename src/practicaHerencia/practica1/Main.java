package practicaHerencia.practica1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void catalogar(List<Vehiculo> vehiculos, int numRuedas){
        int contadorVehiculos = 0;
        for (Vehiculo v :vehiculos) {
            if(v.getRuedas()== numRuedas){
                contadorVehiculos+=1;
                /*INSTANCEOF es para verificar el tipo de cada objeto */
                if (v instanceof Camioneta camioneta) {
                    System.out.println("--Camioneta--\nColor: " + camioneta.getColor() + ", Ruedas: " + camioneta.getRuedas() + ", Velocidad: " + camioneta.getVelocidad() + ", Cilindrada: " + camioneta.getCilindrada() + ", Carga: " + camioneta.getCarga());
                } else if (v instanceof Motocicleta motocicleta) {
                    System.out.println("--Motocicleta--\nColor: " + motocicleta.getColor() + ", Ruedas: " + motocicleta.getRuedas() + ", Tipo: " + motocicleta.getTipo() + ", Velocidad: " + motocicleta.getVelocidad() + ", Cilindrada: " + motocicleta.getCilindrada());
                } else if (v instanceof Coche coche) {
                    System.out.println("--Coche--\nColor: " + coche.getColor() + ", Ruedas: " + coche.getRuedas() + ", Velocidad: " + coche.getVelocidad() + ", Cilindrada: " + coche.getCilindrada());
                } else if (v instanceof Bicicleta bicicleta) {
                    System.out.println("--Bicicleta--\nColor: " + bicicleta.getColor() + ", Ruedas: " + bicicleta.getRuedas() + ", Tipo: " + bicicleta.getTipo());
                } else {
                    System.out.println("--Vehículo--\nColor: " + v.getColor() + ", Ruedas: " + v.getRuedas());
                }
            }
        }
        System.out.println("Se han encontrado "+contadorVehiculos+" vehículos con "+numRuedas+" ruedas");
    }


    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo vehiculo1 = new Vehiculo("Rojo", 4);
        vehiculos.add(vehiculo1);

        Coche coche1 = new Coche("Azul", 4, 120, 2000);
        vehiculos.add(coche1);
        Bicicleta bicicleta1 = new Bicicleta("Verde", 2, "urbana");
        vehiculos.add(bicicleta1);

        Camioneta camioneta1 = new Camioneta("Blanco", 4, 100, 2500, 1000);
        vehiculos.add(camioneta1);
        Motocicleta motocicleta1 = new Motocicleta("Negro", 2, "deportiva", 150, 1000);
        vehiculos.add(motocicleta1);

        catalogar(vehiculos,2);
    }
}
