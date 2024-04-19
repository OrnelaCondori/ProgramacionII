package TP2.Punto2;

public class Main {
    public static void main(String[] args) {
        Novel b1 = new Novel("Cometas en el cielo", "Khaled Hosseini",2003, false, "Suspenso");
        Novel b2 = new Novel("1984", "George Orwell", 1949,false, "Ciencia Ficcion");
        University b3 = new University("Introduccion a la Computación", "J.K.Rowling", 1997, false, "Ing.sistemas");
        Childish b4 = new Childish("El principito", "Antonie deSaint", 1943, false, "pespectiva del mundo");
        Novel b5 = new Novel("Cien años de soledad", "Gabriel Garcia Marquez", 1967, false,"Realismo");

        Library libreria = new Library();

        libreria.addBook(b1);
        libreria.addBook(b2);
        libreria.addBook(b3);
        libreria.addBook(b4);
        libreria.addBook(b5);

        b3.leadbook();
        b4.leadbook();
        b1.leadbook();

        libreria.listBooks();

        System.out.println(" ");
        b1.leadbook();
        b4.returnBook();

        libreria.listBooks();
    }
}
