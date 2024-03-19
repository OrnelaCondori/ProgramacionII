package practicaHerencia.practica2;

public class Perro extends Animal{
    private String race;
    private String color;

    public Perro() {
    }

    public Perro(String name, int age, String gender, String race, String color) {
        super(name, age, gender);
        this.race = race;
        this.color = color;
    }
    public void comer(){
        System.out.println(getName()+" esta comiendo");
    }
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau Guau!");
    }
    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Raza: "+getRace()+"\nColor: "+getColor());
    }


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
