package TP2.Punto2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> Books;

    public Library() {
        Books = new ArrayList<>();
    }

    public void addBook(Book book){
        Books.add(book);
    }

    public void listBooks() {
        System.out.println("\nLos libros disponibles son:");
        for (Book book: Books) {
            if (!book.isLend()){
                System.out.println(book.getTitle());
            }
        }
    }


}
