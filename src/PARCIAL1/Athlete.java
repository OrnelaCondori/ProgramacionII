package PARCIAL1;

public class Athlete extends Person implements Contract, Math{
    private double height;
    private int age;
    private double weight;

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public double calculateIMC() {
        return (weight/(height*height));
    }

    @Override
    public boolean extraWeight(double imc) {
        return imc>=25.0;
    }

    @Override
    public double takePulses() {
        return 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
