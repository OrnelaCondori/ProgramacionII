package PARCIAL1;

import java.util.ArrayList;
import java.util.List;

public class NacionalTeam {
    private String color;
    private String country;
    private List<Athlete> athletes;

    public NacionalTeam(String color, String country) {
        this.color = color;
        this.country = country;
        athletes = new ArrayList<>();
    }

    public void addAthlete(Athlete athlete){
        athletes.add(athlete);
    }
    public List<Athlete> getAthletes() {
        return athletes;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
