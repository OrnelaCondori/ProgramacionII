package PARCIAL1;

import java.util.ArrayList;
import java.util.List;

public class Sede {
    private int fase;
    private String date;
    private String hour;
    private List<Test> Tests;
    private List<Facilities> FacilitiesList;

    public Sede(int fase, String date, String hour) {
        this.fase = fase;
        this.date = date;
        this.hour = hour;
        Tests = new ArrayList<>();
        FacilitiesList = new ArrayList<>();
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
    public List<Test> getTests() {
        return Tests;
    }

    public void setTests(List<Test> tests) {
        Tests = tests;
    }
    public void addTest(Test test){
        Tests.add(test);
    }

    public List<Facilities> getFacilitiesList() {
        return FacilitiesList;
    }

    public void setFacilitiesList(List<Facilities> facilities) {
        FacilitiesList = facilities;
    }
    public void addFacilities(Facilities facilities){
        FacilitiesList.add(facilities);
    }
}
