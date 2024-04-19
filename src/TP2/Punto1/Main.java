package TP2.Punto1;

public class Main {
    public static void main(String[] args) {
        // Crear una tienda
        TiendaMascotas tienda = new TiendaMascotas();

        // Crear animales de cada tipo
        Perro perro1 = new Perro("Kira", 7, "perro", 5000, "golden",true);
        Gato gato1 = new Gato("Strudel", 2, "gato", 4000, "siames",true);
        Ave ave1 = new Ave("capi", 5, "Ave", 4500, "loro",true);
        Pez pez1 = new Pez("Dori", 2, "Pez", 2000, "payaso","azul");

        // Agregar animales a la tienda
        tienda.addAnimal(perro1);
        tienda.addAnimal(gato1);
        tienda.addAnimal(ave1);
        tienda.addAnimal(pez1);

        System.out.println(" ");
        tienda.listarAnimales();

        System.out.println(" ");
        tienda.venderAnimal("Kira");

        tienda.alimentarAnimal("Dori");

        System.out.println(" ");
        tienda.listarAnimales();
    }
}

