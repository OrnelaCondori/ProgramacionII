package TP2.Punto1;

public class Ave extends Animal{
    private String species;
    private boolean speech;

    public Ave(String name, int age, String animalType, double price, String species, boolean speech) {
        super(name, age, animalType, price);
        this.species = species;
        this.speech = speech;
    }
}
