package TP1.punto10;

public class Book {
    private String title;
    private String writer;
    private double price;

    public Book() {
    }

    public Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }
    public void Info() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + writer);
        System.out.println("Precio: $" + price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
