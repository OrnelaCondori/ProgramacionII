package practicaHerencia.practica2;

public class Elefante extends Animal{
    private String species;
    private double weight;
    private double height;

    public Elefante() {
    }

    public Elefante(String name, int age, String gender, String species, double weight, double height) {
        super(name, age, gender);
        this.species = species;
        this.weight = weight;
        this.height = height;
    }
    public void tomarAgua(){
        System.out.println(getName()+" esta tomando agua");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El elefante esta barritando");
    }
    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Especie: "+getSpecies()+"\nPeso: "+getWeight()+"\nAltura: "+getHeight());
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
