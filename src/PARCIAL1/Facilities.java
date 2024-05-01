package PARCIAL1;

import java.util.ArrayList;
import java.util.List;

public class Facilities {
    private String category;
    private String location;
    private String name;
    private String type;
    private List<Test> Tests;
    private Sede sede;

    public Facilities(String category, String location, String name, String type) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
        Tests = new ArrayList<>();
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}
