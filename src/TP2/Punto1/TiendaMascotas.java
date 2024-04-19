package TP2.Punto1;
import java.util.List;
import java.util.ArrayList;
class TiendaMascotas {
    private List<Animal> inventory;

    public TiendaMascotas() {
        inventory = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        inventory.add(animal);
    }


    public void venderAnimal(String name){
        for (Animal animal:inventory){
            if (animal.toString().contains(name)){
                inventory.remove(animal);
                System.out.println("Se vendio el animal: "+animal);
                return;
            }
        }
    }
    public void alimentarAnimal(String name){
        for (Animal animal:inventory){
            if (animal.toString().contains(name)){
                animal.feed(name);
                return;
            }
        }
        System.out.println("no se encontro ningun animal con el nombre: "+name);
    }

    public void listarAnimales(){
        System.out.println("Animales en la tienda:");
        for (Animal animal: inventory){
            System.out.println(animal);
        }
    }
}







