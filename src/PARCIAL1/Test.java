package PARCIAL1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private int codigo;
    private String titulo;
    private List<Athlete> athleteParticipants;
    private Facilities facilities;

    public Test(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        athleteParticipants = new ArrayList<>();
    }

    public void addAthleteParticipant(Athlete athlete){
        athleteParticipants.add(athlete);
    }

    public List<Athlete> getAthleteParticipants() {
        return athleteParticipants;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
