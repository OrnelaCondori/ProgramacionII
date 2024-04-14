package TP1.punto10;

public class Main {
    public static void main(String[] args){
        Book libro = new Book("El principito", "Antoine de Saint-Exupéry");
        libro.setPrice(15.99);
        libro.Info();

        System.out.println();

        BookOfText libroTexto = new BookOfText("Álgebra lineal", "Howard Anton", "Matemáticas");
        libroTexto.setPrice(29.99);
        libroTexto.Info();

        System.out.println();


        BookOfTextUNC libroU = new BookOfTextUNC("Cálculo diferencial", "James Stewart", "Matemáticas", "Facultad de Ciencias");
        libroU.setPrice(39.99);
        libroU.Info();

        System.out.println();

        Novel novela = new Novel("Cien años de soledad", "Gabriel García Márquez", "Realista");
        novela.setPrice(24.99);
        novela.Info();
    }
}
