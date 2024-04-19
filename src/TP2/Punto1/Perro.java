package TP2.Punto1;

public class Perro extends Animal{
    private String race;
    private boolean vaccinated;

    public Perro(String name, int age, String animalType, double price, String race, Boolean vaccinated) {
        super(name, age, animalType, price);
        this.race = race;
        this.vaccinated = vaccinated;
    }
}
