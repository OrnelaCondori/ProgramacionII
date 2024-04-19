package TP2.Punto2;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, int yearPublic, boolean lend, String genre) {
        super(title, author, yearPublic, lend);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
