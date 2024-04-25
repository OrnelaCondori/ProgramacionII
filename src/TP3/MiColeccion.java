package TP3;
import java.util.Iterator;

//al implementar la interfaz iterable puede ser iterada usando un bucle for-each
public class MiColeccion implements Iterable<String> {
    private String[] elementos;
    private int tamaño;

    public MiColeccion(int capacidad) {
        elementos = new String[capacidad];
        tamaño = 0;
    }

    //agrega un elemento y luego incrementa incrementa el tamaño
    public void agregar(String elemento) {
        elementos[tamaño++] = elemento;
    }

    //devuelve un objeto iterador
    @Override
    public Iterator<String> iterator() {
        return new IteradorMiColeccion();
    }

    private class IteradorMiColeccion implements Iterator<String> {
        private int indice = 0;

        @Override
        public boolean hasNext() {
            return indice < tamaño;
        }

        @Override
        public String next() {
            return elementos[indice++];
        }
    }

    public static void main(String[] args) {
        MiColeccion coleccion = new MiColeccion(3);
        coleccion.agregar("Uno");
        coleccion.agregar("Dos");
        coleccion.agregar("Tres");

        for (String elemento : coleccion) {
            System.out.println(elemento);
        }
    }
}