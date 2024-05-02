package PARCIAL1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Sede sede1 = new Sede(1, "09/05", "15:30hs");
        Test test1 = new Test(159, "Salto en largo");
        Test test2 = new Test(148, "Carrera de 100 metros");
        Athlete ath1 = new Athlete(12345678, "Maria", 1.70, 21, 67);
        Athlete ath2 = new Athlete(12345789, "Mario", 1.81, 26, 85);
        Athlete ath3 = new Athlete(15467892, "Juan", 1.69, 20, 70);
        Athlete ath4 = new Athlete(26984579, "Lucia", 1.68, 22, 65);
        Athlete ath5 = new Athlete(26589434, "Laura", 1.76, 28, 60);
        NacionalTeam team1 = new NacionalTeam("celeste", "Argentina");
        Facilities facilities = new Facilities("Atletismo", "Buenos Aires","Monumental", "Estadio");

        //establecemos las agregaciones y asociaciones correspondientes
        team1.addAthlete(ath1);
        team1.addAthlete(ath2);
        team1.addAthlete(ath3);

        test1.addAthleteParticipant(ath2);
        test1.addAthleteParticipant(ath5);
        test2.addAthleteParticipant(ath1);
        test2.addAthleteParticipant(ath3);
        test2.addAthleteParticipant(ath4);

        sede1.addTest(test1);
        sede1.addTest(test2);
        facilities.setSede(sede1);



        //Desde instalación
        //Nombre del 3er atleta de la 2da prueba
        System.out.println("El nombre del tercer atleta de la segunda prueba es: ");
        System.out.println(facilities.getSede().getTests().get(1).getAthleteParticipants().get(2).getName());
        //Código de la 2da prueba.
        System.out.println("El codigo de la segunda prueba es: ");
        System.out.println(facilities.getSede().getTests().get(1).getCodigo());

        System.out.println(" ");

        //Desde Equipo nacional
        //Altura de todos los atletas
        System.out.println("en el equipo nacional de "+team1.getCountry()+":");
        for (Athlete athelete: team1.getAthletes()){
            System.out.println("La altura del atleta "+athelete.getName()+" es: "+athelete.getHeight());
        }
        //Peso extra de cada atleta
        for (Athlete athelete: team1.getAthletes()){
            System.out.println("Peso extra "+athelete.getName()+": "+athelete.extraWeight(athelete.calculateIMC()));
        }

    }
}
