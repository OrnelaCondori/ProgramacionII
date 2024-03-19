package practicaHerencia.practica2;

public class Caballo extends Animal{
    private String race;
    private String habitat;
    private String color;

    public Caballo() {
    }

    public Caballo(String name, int age, String gender, String race, String habitat, String color) {
        super(name, age, gender);
        this.race = race;
        this.habitat = habitat;
        this.color = color;
    }
    public void galopar() {
        System.out.println("El caballo está galopando.");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El caballo relinchar ¡Hiiiiiiiiiii!");
    }

    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Raza: "+getRace()+"\nHabitad: "+getHabitat()+"\nColor: "+getColor());
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
